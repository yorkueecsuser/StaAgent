class BuggyArray {
    public static int showBug(int[] arr, int length) {
        // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        return arr[length];
    }

    public static void main(String[] args) {
        int[] vlsqanza = {1, 2, 3, 4, 5};
        System.out.println(showBug(vlsqanza, 5)); // Index 5 is out of bounds for length 5
    }
}