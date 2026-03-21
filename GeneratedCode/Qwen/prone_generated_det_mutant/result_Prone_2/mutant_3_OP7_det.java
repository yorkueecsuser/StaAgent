import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
boolean lblulnen = false;while (lblulnen && true && true && true && true && true && false && false && true && true && true && false) {int ywucqvyk = 200978206;}

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