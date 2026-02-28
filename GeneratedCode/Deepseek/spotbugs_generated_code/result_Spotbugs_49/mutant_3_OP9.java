class ArrayOutOfBoundsBug {

    public int showBug(int[] arr, int offset) {
        // Accessing element at the offset which could be out of bounds
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
        return arr[offset];
    }

    public int showBugWithMutant(int[] arr, int offset) {
        // Mutant: Equivalent Loop Replacement
        int result = 0;
        int i = 0;
        do {
            if (i == offset) {
                result = arr[i];
                break;
            }
            i++;
        } while (i < arr.length);
        return result;
    }

    public static void main(String[] args) {
        ArrayOutOfBoundsBug bug = new ArrayOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        int invalidOffset = 10; // offset is out of array bounds
        bug.showBug(arr, invalidOffset);
        bug.showBugWithMutant(arr, invalidOffset);
    }
}