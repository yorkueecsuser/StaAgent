class ArrayOutOfBoundsBug {

    // Method to check if a value is zero
    private boolean isZero(int value) {
        return value == 0;
    }

    public int showBug(int[] arr, int offset) {
        // Unreachable if-else branch
        if (isZero(offset)) {
            System.out.println("This branch is unreachable due to the array offset bug.");
        } else {
            // Original code
            return arr[offset];
        }
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}