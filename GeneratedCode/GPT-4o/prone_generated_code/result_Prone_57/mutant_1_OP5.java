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

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        System.out.println(example.showBug()); // Demonstrating the bug
        
        // Inserting an unreachable switch statement
        int unreachableSwitchCondition = getUnreachableValue();
        switch(unreachableSwitchCondition) {
            case 999: 
                System.out.println("This case is unreachable.");
                break;
            // No default case to ensure no reachable code follows
        }
    }

    // Helper method to ensure the switch is unreachable
    public static int getUnreachableValue() {
        return -1; // Always returns a value that does not match any case
    }
}