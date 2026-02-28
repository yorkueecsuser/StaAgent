class BuggyArray {
    public static int showBug(int[] arr, int length) {
        // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        int index = length;
        // Mutation: Unreachable switch statement
        switch (index - arr.length) {
            case 1:
                System.out.println("This should never print");
                break;
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
    }

    // Method to dynamically determine the condition for the unreachable switch statement
    private static boolean getCondition() {
        return false;
    }
}