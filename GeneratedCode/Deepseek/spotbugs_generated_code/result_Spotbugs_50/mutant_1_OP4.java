class BuggyArray {
    public static int showBug(int[] arr, int length) {
        // Original bug: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable if-else branch added as per the mutation operator
            return -1;
        } else {
            return arr[length];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
    }
}