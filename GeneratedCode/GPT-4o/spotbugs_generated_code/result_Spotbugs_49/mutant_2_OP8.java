class ArrayOffsetBugExample {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}; // Renamed exampleArray to a
        try {
            int r = showBug(a, 10); // Renamed result to r
            System.out.println("Result: " + r);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int offset) {
        // Attempt to access array with an out-of-bounds offset
        return array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }
}