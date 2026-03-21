import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
        return array1.equals(array2); // BUG: ArrayEquals
    }

    public static void main(String[] args) {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] wceavmhm = {1, 2, 3};
        int[] zozptsgh = {1, 2, 3};
        boolean argscllg = bugDemo.showBug(wceavmhm, zozptsgh);
        System.out.println("Result of buggy comparison: " + argscllg);
    }
}