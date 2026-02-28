class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Introduced loop that does not affect the existing bug
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }

        // Equivalent Loop Replacement: Replace the while loop with a do-while loop
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += array[j];
            j++;
        } while (j < array.length);

        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}