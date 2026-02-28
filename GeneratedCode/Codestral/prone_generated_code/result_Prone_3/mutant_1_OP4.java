import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]

        // Unreachable if-else statement mutation
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute.");
        } else {
            // Original code
            System.out.println("This is the original code.");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}