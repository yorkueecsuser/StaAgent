class BuggyArray {
    public static boolean getCondition() {
        return false;
    }

    public static int showBug(int[] arr, int length) {
        // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable
            System.out.println("Unreachable code");
        }
        return arr[length];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
    }
}