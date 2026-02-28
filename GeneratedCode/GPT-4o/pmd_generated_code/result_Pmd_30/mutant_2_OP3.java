import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
    }

    public static void showBug1() {
        // Insert unreachable if statement
        boolean condition = getCondition(); // Dynamically determined at runtime
        if (condition) {
            System.out.println("This will never print.");
        }

        // Passing an array of Strings to a varargs method expecting Object...
        varargsMethod(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void showBug2() {
        // Insert unreachable if statement
        boolean condition = getCondition(); // Dynamically determined at runtime
        if (condition) {
            System.out.println("This will never print.");
        }

        // Passing null to a varargs method
        varargsMethod(null); // BUG: ConfusingArgumentToVarargsMethod
    }

    public static void main(String[] args) {
        showBug1();
        showBug2();
    }

    // Method to simulate dynamic condition
    public static boolean getCondition() {
        return false; // This ensures the if block is never executed
    }
}