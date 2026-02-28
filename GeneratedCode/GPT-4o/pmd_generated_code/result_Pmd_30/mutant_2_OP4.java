import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));

        // Inserting an unreachable if-else statement
        boolean shouldExecute = determineExecution(); // Non-final variable to ensure runtime evaluation
        if (shouldExecute) {
            System.out.println("This will never execute.");
        } else {
            System.out.println("Executing else branch.");
        }
    }

    // Helper method to ensure the condition is dynamically determined
    private static boolean determineExecution() {
        return false;
    }

    public static void showBug1() {
        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void showBug2() {
        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }
}