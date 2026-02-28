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

        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block will never execute.");
        } else {
            System.out.println("This block is always executed.");
        }

        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    private boolean getCondition() {
        return false; // Ensure not compile-time constant
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
    }
}