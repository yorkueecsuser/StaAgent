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
        for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            sum += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
        }

        // Inserted unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("Unreachable case 1.");
                break;
            case 2:
                System.out.println("Unreachable case 2.");
                break;
            default:
                // Default case, still unreachable
                System.out.println("Unreachable default case.");
                break;
        }
        
        return sum;
    }

    // Method to return a value that makes the switch unreachable
    public static int getUnreachableValue() {
        return 3; // This value doesn't match any of the case labels in the switch statement
    }
}