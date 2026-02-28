class BuggyArray {
    public static int showBug(int[] arr, int length) {
        // Original Bug: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable if statement
            System.out.println("This line is unreachable.");
        }
        return arr[length];
    }

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
    }
}