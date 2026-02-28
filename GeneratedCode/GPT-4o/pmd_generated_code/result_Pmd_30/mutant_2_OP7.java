import java.util.Arrays;

class VarargsConfusionExample {

    public static void varargsMethod(Object... args) {
        System.out.println("Received args: " + Arrays.deepToString(args));
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

        // Inserting an unreachable while loop with a condition that is always false
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed");
        }
    }

    // Method to generate a false condition for the unreachable while loop
    private static boolean getCondition() {
        return false;
    }
}