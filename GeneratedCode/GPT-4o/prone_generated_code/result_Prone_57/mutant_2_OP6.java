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
        boolean conditionFor = getConditionFor(); // Condition for the unreachable for loop
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This loop is unreachable and serves as a mutation test.");
        }
        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    private boolean getConditionFor() {
        return false; // This method ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
    }
}