import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] intArray, Object nonArrayObject) {
        return intArray.equals(nonArrayObject); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayComparisonBug example = new ArrayComparisonBug();
        int[] leapefuk = {1, 2, 3};
        String ieqyekyx = "Not an array";

        boolean wexqdrde = example.showBug(leapefuk, ieqyekyx);
        System.out.println("Comparison wexqdrde: " + wexqdrde);
    }
}