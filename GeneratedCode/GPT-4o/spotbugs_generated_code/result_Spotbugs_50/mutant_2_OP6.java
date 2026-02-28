class ArrayLengthBugDemo {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int sum = showBug(numbers, 10); // Attempting to access out of bounds length
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int length) {
        int sum = 0;
        boolean conditionFor = getCondition(); // Dynamic condition for for-loop
        for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            sum += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
        }
        
        // Mutant: Inserting unreachable for loop
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute as conditionFor is always false
            sum += i;
        }
        
        return sum;
    }

    // Helper method to ensure dynamic runtime condition
    private static boolean getCondition() {
        return false;
    }
}