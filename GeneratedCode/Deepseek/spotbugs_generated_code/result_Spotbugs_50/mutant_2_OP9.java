class BuggyArray {
    public static int showBug(int[] arr, int length) {
        // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        return arr[length];
    }

    public static int showMutation(int[] arr, int length) {
        int i = 0;
        do {
            // Equivalent Loop Replacement
            if(i == length)
                return arr[i];
            i++;
        } while(i < arr.length);
        return -1; // To avoid compilation error as the loop might not always return a value
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
        System.out.println(showMutation(arr, 5)); // Index 5 is out of bounds for length 5
    }
}