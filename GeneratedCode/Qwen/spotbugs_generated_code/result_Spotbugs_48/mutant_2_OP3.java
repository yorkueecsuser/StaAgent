class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code block
            System.out.println("This is an unreachable code block.");
        }
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}