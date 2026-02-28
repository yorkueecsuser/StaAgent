class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Inserted unreachable if statement
        if (isConditionFalse()) {
            // This block is unreachable
            return 0;
        }

        // Accessing element at the offset which could be out of bounds
        return arr[offset];
    }

    // Method that returns false to make the if statement unreachable
    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}