import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
boolean xyqwgkfp = false;while (xyqwgkfp && false && false && true && true && true && false && false && true && false && true && false) {long pxriuefp = 777799030;}

        return array1.equals(array2); // BUG: ArrayEquals
    
}

    public static void main(String[] args) {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {1, 2, 3};
        boolean result = bugDemo.showBug(arrayA, arrayB);
        System.out.println("Result of buggy comparison: " + result);
    }
}