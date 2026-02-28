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
        int unreachableSwitchCondition = getUnreachableSwitchCondition(); // Non-final variable for switch condition
        switch (unreachableSwitchCondition) {
            case 1:
                // This code is unreachable because getUnreachableSwitchCondition() will never return 1
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case does nothing
                break;
        }
        for (int i = 0; i < length; i++) { // BUG: RANGE: Array length is out of bounds (RANGE_ARRAY_LENGTH)
            sum += array[i]; // This will throw IndexOutOfBoundsException when i >= array.length
        }
        return sum;
    }

    public static int getUnreachableSwitchCondition() {
        // Always returns 0, making switch cases other than default unreachable
        return 0;
    }
}