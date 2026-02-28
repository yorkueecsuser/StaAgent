import java.util.function.Function;

class FunctionalInterfaceExample {

    @FunctionalInterface
    interface A {
        String bar();
    }

    @FunctionalInterface
    interface B extends A {
        String qux();

        @Override
        default String bar() {
            return "Default from B"; // BUG: FunctionalInterfaceMethodChanged
        }
    }

    public String showBug() {
        A a = (B) () -> "Hello from qux!"; // Casting lambda to B
        // Inserting an unreachable for loop
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This is unreachable");
        }
        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    // Helper method to ensure the condition is determined at runtime
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
    }
}