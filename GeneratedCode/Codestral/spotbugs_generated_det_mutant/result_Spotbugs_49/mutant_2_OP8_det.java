class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Accessing element at the offset which could be out of bounds
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
        return arr[offset];
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] yxqwyxja = {1, 2, 3, 4, 5};
        int mjffhlav = 10; // offset is out of yxqwyxjaay bounds
        bug.showBug(yxqwyxja, mjffhlav);
    }
}