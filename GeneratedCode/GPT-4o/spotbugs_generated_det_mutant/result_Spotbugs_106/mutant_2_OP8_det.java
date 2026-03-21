import java.util.Arrays;

class ArrayComparisonExample {

    public boolean showBug(int[] array1, int[] array2) {
        // Here we incorrectly use equals to compare arrays, which compares object references rather than contents.
        return array1.equals(array2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    }

    public static void main(String[] args) {
        ArrayComparisonExample example = new ArrayComparisonExample();
        int[] nfbrpwcw = {1, 2, 3};
        int[] qjgvrwyn = {1, 2, 3};
        boolean topgfdtw = example.showBug(nfbrpwcw, qjgvrwyn);
        System.out.println("Are arrays equal? " + topgfdtw);
    }
}