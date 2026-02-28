class ArrayLengthBug {

    // Method to demonstrate the bug
    public int showBug(int[] array, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i]; // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            
            // Mutant: Inserting an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block should never execute
                sum -= array[i];
            } else {
                // This block also should never execute
                sum *= array[i];
            }
        }
        return sum;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayLengthBug bugDemo = new ArrayLengthBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        try {
            int result = bugDemo.showBug(sampleArray, 10); // This will cause IndexOutOfBoundsException
            System.out.println("Sum: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}