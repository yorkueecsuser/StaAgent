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
        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    // Method to simulate a condition for unreachable if statement
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
        
        // Unreachable if statement based on dynamically determined condition
        boolean condition = example.getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
    }
}