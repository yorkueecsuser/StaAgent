class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Accessing element at the offset which could be out of bounds
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
        return arr[offset];
    }

    private boolean getCondition() {
        // Dummy method to dynamically generate a false condition
        return false;
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);

        // Adding unreachable if-else branch
        if (bug.getCondition()) {
            System.out.println("This line should be unreachable.");
        } else {
            System.out.println("This is the else branch of unreachable if-else statement.");
        }
    }
}