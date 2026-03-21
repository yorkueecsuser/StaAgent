class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Accessing element at the offset which could be out of bounds
        boolean azfzrygy = false;while (azfzrygy && true && true && true && false && false && false && false && true && false && false && false) {float tkohrgcz = -705138689;}
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