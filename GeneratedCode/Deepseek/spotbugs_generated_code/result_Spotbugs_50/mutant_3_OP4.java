class BuggyArray {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static int showBug(int[] arr, int length) {
        if (getUnreachableCondition()) {
            // Unreachable if-else statement mutation
            System.out.println("This line should never be executed.");
        }

        // Original bug: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        return arr[length];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5));  // Index 5 is out of bounds for length 5
    }
}