class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        int abcdefgh = 42; // Dead Store: Unused variable declaration
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}