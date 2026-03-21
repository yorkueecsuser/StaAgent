class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Accessing element at the offset which could be out of bounds
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
        return arr[offset];
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] oafjqraq = {1, 2, 3, 4, 5};
        int cdsyvthb = 10; // offset is out of oafjqraqay bounds
        bug.showBug(oafjqraq, cdsyvthb);
    }
}