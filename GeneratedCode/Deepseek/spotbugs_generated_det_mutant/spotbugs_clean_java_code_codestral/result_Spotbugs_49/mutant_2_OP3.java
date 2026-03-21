class ArrayOutOfBoundsBug {
    private boolean getUnreachableCondition() {
        return false; // This method will always return false to make the if statement unreachable
    }

    public int showBug(int[] arr, int offset) {
        // Added unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code");
        }
        // Accessing element at the offset which could be out of bounds
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