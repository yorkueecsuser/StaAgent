class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Adding unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable loop");
        }

        // Original code
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
        return arr[offset];
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}