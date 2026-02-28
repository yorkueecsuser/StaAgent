class ArrayOffsetBug {

    // Method to demonstrate the Array offset out of bounds bug
    public int showBug(int[] array, int offset) {
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET) 
        return array[offset];
    }

    public static void main(String[] args) {
        ArrayOffsetBug bugDemo = new ArrayOffsetBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        try {
            // Calling the buggy method with an offset that is out of bounds
            int result = bugDemo.showBug(sampleArray, 5);
            System.out.println("Result: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }

        // Mutated code with renaming
        ArrayOffsetBug z = new ArrayOffsetBug();
        int[] b = {10, 20, 30, 40, 50};
        try {
            // Calling the buggy method with an offset that is out of bounds
            int c = z.showBug(b, 5);
            System.out.println("Mutated Result: " + c);
        } catch (IndexOutOfBoundsException f) {
            System.err.println("Caught an IndexOutOfBoundsException in mutated code: " + f.getMessage());
        }
    }
}