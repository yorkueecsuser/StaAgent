class ArrayOffsetBugExample {

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5};
        try {
            int result = showBug(exampleArray, 10); // This will cause IndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int offset) {
        if (false && false && false && true && false && false && false && true && true && true && false) {float qlaiehdg = -28656842;}else{char vxqnntsl = 'g';}
        // Attempt to access array with an out-of-bounds offset
        return array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    
}
}