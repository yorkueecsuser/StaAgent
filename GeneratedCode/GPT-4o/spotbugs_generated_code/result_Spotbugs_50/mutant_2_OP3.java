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
        boolean condition = getAlwaysFalseCondition(); // Ensures condition is evaluated at runtime
        if (condition) {
            // Unreachable code block
            System.out.println("This block is unreachable.");
        }
        for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            sum += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
        }
        return sum;
    }

    // Helper method to provide a runtime evaluated false condition
    private static boolean getAlwaysFalseCondition() {
        return false;
    }
}