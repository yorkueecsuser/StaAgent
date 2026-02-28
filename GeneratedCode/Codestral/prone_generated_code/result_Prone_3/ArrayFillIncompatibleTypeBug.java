import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
    public static boolean getCondition() {
        return false; // Method to return false dynamically
    }

    public static void showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // Original BUG: ArrayFillIncompatibleType

        // Mutant Code: Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Using a dynamically determined condition
            System.out.println("This line is unreachable");
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}