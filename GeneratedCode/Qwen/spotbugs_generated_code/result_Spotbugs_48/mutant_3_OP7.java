class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
        
        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}