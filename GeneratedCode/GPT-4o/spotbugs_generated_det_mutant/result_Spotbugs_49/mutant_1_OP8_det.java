class ArrayOffsetBugExample {

    public static void main(String[] args) {
        int[] atrqyaov = {1, 2, 3, 4, 5};
        try {
            int ckypdaqb = showBug(atrqyaov, 10); // This will cause IndexOutOfBoundsException
            System.out.println("Result: " + ckypdaqb);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int offset) {
        // Attempt to access array with an out-of-bounds offset
        return array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }
}