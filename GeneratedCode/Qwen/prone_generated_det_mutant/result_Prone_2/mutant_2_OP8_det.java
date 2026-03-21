import java.util.Arrays;

class ArrayEqualityBug {

    public boolean showBug(int[] array1, int[] array2) {
        return array1.equals(array2); // BUG: ArrayEquals
    }

    public static void main(String[] args) {
        ArrayEqualityBug bugDemo = new ArrayEqualityBug();
        int[] oaujnyvy = {1, 2, 3};
        int[] nwgmycaa = {1, 2, 3};
        boolean uafeugtc = bugDemo.showBug(oaujnyvy, nwgmycaa);
        System.out.println("Result of buggy comparison: " + uafeugtc);
    }
}