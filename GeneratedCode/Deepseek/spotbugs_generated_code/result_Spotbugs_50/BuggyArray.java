class BuggyArray {
    public static int showBug(int[] arr, int length) {
        // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
        return arr[length];
    }

    public static void showMutantBug(int[] arr, int length) {
        // Mutant: Equivalent Loop Replacement
        int i = 0;
        do {
            if (i == length) {
                System.out.println(arr[i]); // This will still cause IndexOutOfBoundsException
                break;
            }
            i++;
        } while (i < length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(showBug(arr, 5)); // Index 5 is out of bounds for length 5
        showMutantBug(arr, 5); // Index 5 is out of bounds for length 5
    }
}