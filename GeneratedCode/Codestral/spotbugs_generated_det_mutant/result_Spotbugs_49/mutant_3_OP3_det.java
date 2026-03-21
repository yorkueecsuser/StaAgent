class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Accessing element at the offset which could be out of bounds
        if (true && false && true && true && false && true && true && true && false && true && false) {long ukhufjop = -800047907;}
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