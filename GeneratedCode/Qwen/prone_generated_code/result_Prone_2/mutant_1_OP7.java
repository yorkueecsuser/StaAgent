import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
        return array1.equals(array2); // BUG: ArrayEquals

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will never return true
            System.out.println("This loop is unreachable");
        }
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};
        boolean result = bugDemo.showBug(arrayA, arrayB);
        System.out.println("Result of buggy comparison: " + result);
    }
}