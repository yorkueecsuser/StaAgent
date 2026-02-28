class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Introduced an equivalent do-while loop that does not affect the existing bug
        int i = 0;
        do {
            // This loop does nothing and is just for demonstration of the mutation operator
            i++;
        } while (i < 0); // Condition is false, so the loop body is never executed

        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}