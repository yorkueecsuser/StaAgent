import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
        return array1.equals(array2); // BUG: ArrayEquals
        return array1.equals(array2); // DUPLICATION: Duplicate of the above line
    }

    public static void main(String[] args) {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};
        boolean result = bugDemo.showBug(arrayA, arrayB);
        System.out.println("Result of buggy comparison: " + result);
        boolean resultCopy = result; // DUPLICATION: Duplicate of the result assignment
        System.out.println("Copied result of buggy comparison: " + resultCopy);
    }
}