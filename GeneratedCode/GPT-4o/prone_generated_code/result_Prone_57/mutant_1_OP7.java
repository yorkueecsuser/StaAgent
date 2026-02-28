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
        // Adding unreachable while loop
        boolean conditionWhile = getCondition(); // Method used to prevent compile-time constant
        while (conditionWhile) {
            System.out.println("This will never execute");
        }
        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    // Method added to provide a dynamic condition
    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
    }
}