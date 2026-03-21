class ArrayOffsetBug {

    // Method to demonstrate the Array offset out of bounds bug
    public int showBug(int[] array, int offset) {
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET) 
        return array[offset];
    }

    public static void main(String[] args) {
        ArrayOffsetBug bugDemo = new ArrayOffsetBug();
        int[] ogdsohvg = {1, 2, 3, 4, 5};
        try {
            // Calling the buggy method with an offset that is out of bounds
            int xocxlkhh = bugDemo.showBug(ogdsohvg, 5);
            System.out.println("Result: " + xocxlkhh);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}