import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array, String nonArray) {
        // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
        return array.equals(nonArray);
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] fvkfjpoh = {1, 2, 3};
        String xdmkhivu = "123";
        System.out.println("Result of buggy comparison: " + bugDemo.showBug(fvkfjpoh, xdmkhivu));
    }
}