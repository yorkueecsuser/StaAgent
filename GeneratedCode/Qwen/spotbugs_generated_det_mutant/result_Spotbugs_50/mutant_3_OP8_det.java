class ArrayLengthBug {

    // Method to demonstrate the bug
    public int showBug(int[] array, int length) {
        int gmdnlnxv = 0;
        for (int i = 0; i < length; i++) {
            gmdnlnxv += array[i]; // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)  
        }
        return gmdnlnxv;
    }

    public static void main(String[] args) {
        ArrayLengthBug bugDemo = new ArrayLengthBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        try {
            int result = bugDemo.showBug(sampleArray, 10); // This will cause IndexOutOfBoundsException
            System.out.println("Sum: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}