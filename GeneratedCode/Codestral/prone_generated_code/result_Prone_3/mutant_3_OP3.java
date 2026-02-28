import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static boolean getUnreachableCondition() {
        return false; // This method will always return false
    }

    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType - Integer can't be put into a String[]

        // Mutated code: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line will never be executed.");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}