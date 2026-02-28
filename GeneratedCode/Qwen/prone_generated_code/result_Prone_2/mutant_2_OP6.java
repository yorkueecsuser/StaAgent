import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
        return array1.equals(array2); // BUG: ArrayEquals

        // Unreachable for loop inserted here
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute because conditionFor is always false
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};
        boolean result = bugDemo.showBug(arrayA, arrayB);
        System.out.println("Result of buggy comparison: " + result);
    }
}