class ArrayOutOfBoundsBug {

    private boolean falseCondition() {
        return false;
    }

    public int showBug(int[] arr, int offset) {
        // Insert unreachable while loop
        while (falseCondition()) {
            // Unreachable code
            int i = 10;
        }
        // Original bug remains unchanged
        return arr[offset];
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
    }
}