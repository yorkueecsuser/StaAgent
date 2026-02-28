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

    // Inserting unreachable if-else branch
    public void demonstrateUnreachableBranch() {
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch will never be reached.");
        } else {
            System.out.println("This is an unreachable branch demonstration.");
        }
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
        example.demonstrateUnreachableBranch(); // Demonstrating the unreachable branch
    }
}