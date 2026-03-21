import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] intArray, Object nonArrayObject) {
        return intArray.equals(nonArrayObject); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayComparisonBug example = new ArrayComparisonBug();
        int[] onfgfiji = {1, 2, 3};
        String xawlgxvp = "Not an array";

        boolean xckbuksp = example.showBug(onfgfiji, xawlgxvp);
        System.out.println("Comparison xckbuksp: " + xckbuksp);
    }
}