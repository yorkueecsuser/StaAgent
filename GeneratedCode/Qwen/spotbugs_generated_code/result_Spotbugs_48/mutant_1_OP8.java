class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException

        // Mutated code
        int[] b = {4, 5, 6};
        int c = 2;
        System.out.println(example.showBug(b, c)); // This is a valid access, but we are not fixing the bug
    }
}