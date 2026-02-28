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
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); 
        for (int j = 0; conditionFor; j++) {
            // Unreachable loop body
            System.out.println("This is unreachable code");
        }

        for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            sum += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
        }
        return sum;
    }
    
    // Method to ensure the loop condition is not a compile-time constant
    private static boolean getCondition() {
        return false;
    }
}