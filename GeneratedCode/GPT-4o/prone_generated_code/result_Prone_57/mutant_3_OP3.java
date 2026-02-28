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
        boolean condition = getCondition(); // Using a method to determine the condition
        if (condition) {
            System.out.println("Unreachable code block!");
        }
        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    // Method to simulate a condition which is always false
    private boolean getCondition() {
        return false; // Always returns false, simulating an unreachable block
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
    }
}