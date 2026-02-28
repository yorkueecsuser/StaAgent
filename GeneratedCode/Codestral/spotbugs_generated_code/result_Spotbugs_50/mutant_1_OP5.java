class BuggyArray {
    public static int showBug(int[] arr, int length) {
        // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        int value = getValue();
        switch (value) {
            case 1:
                break; // Unreachable code
        }
        return arr[length];
    }

    private static int getValue() {
        return 0; // Always returns a value that makes the case unreachable in the switch statement
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
    }
}