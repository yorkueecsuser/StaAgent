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
        
        // Inserting an unreachable while loop based on the mutation operator
        boolean conditionWhile = getCondition(); // Dynamically determined condition
        while (conditionWhile) { 
            System.out.println("This is unreachable code.");
        }

        return a.bar();  // This will return "Default from B" instead of "Hello from qux!"
    }

    // Method to mimic dynamic runtime condition for the unreachable loop
    private boolean getCondition() {
        return false;  // Simulating a condition that makes the loop unreachable
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
    }
}