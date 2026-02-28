class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // unreachable for loop
            System.out.println("This line will never be executed.");
        }
        // Accessing element at the offset which could be out of bounds
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
        return arr[offset];
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}