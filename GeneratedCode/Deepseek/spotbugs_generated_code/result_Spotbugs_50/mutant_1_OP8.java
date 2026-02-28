class BuggyArray {
    public static int showBug(int[] arr, int length) {
        // Original bug: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        return arr[length];
    }

    // Mutated code with renamed variable
    public static int showMutant(int[] arr, int len) {
        // Renamed 'length' to 'len'
        return arr[len];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
        System.out.println(showMutant(arr, 5)); // Using the mutated method with renamed variable
    }
}