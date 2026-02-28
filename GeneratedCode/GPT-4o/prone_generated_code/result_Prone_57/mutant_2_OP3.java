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

    // Method to simulate a condition that is always false at runtime
    private boolean getUnreachableCondition() {
        return Math.random() < 0; // Always false because Math.random() is between 0.0 and 1.0
    }

    public String showBug() {
        A a = (B) () -> "Hello from qux!"; // Casting lambda to B
        
        // Inserting an unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This statement is unreachable.");
        }
        
        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
    }
}