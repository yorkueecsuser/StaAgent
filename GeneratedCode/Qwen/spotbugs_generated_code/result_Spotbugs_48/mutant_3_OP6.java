class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Unreachable for loop inserted here
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
        }
        
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
    }

    private boolean getCondition() {
        // This method always returns false, making the for loop unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}