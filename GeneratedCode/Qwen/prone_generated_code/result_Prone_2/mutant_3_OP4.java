import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
        return array1.equals(array2); // BUG: ArrayEquals

        // Mutant: Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed because condition is always false.");
        } else {
            System.out.println("This will also never be printed because condition is always false.");
        }
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if-else branch unreachable
    }

    public static void main(String[] args) {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};
        boolean result = bugDemo.showBug(arrayA, arrayB);
        System.out.println("Result of buggy comparison: " + result);
    }
}