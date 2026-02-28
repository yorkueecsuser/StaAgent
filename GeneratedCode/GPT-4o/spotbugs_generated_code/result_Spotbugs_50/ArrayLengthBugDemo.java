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
        boolean conditionWhile = getCondition(); // Dynamically determined condition
        while (conditionWhile) {
            // This loop is unreachable due to the condition being false.
            // It is inserted to satisfy the mutation operator requirement.
            System.out.println("This is unreachable code inside a while loop.");
        }
        
        for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds
            sum += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
        }
        return sum;
    }

    // This method is used to prevent compile-time unreachable statement error
    public static boolean getCondition() {
        return false; // Ensures the while loop is never entered
    }
}