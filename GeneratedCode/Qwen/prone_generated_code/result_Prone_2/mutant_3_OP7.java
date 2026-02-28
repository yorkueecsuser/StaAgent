import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
        return array1.equals(array2); // BUG: ArrayEquals

        // Introduced Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This loop is unreachable");
        }
    }

    private boolean getCondition() {
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