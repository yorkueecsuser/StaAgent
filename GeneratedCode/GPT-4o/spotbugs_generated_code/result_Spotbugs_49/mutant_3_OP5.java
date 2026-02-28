class ArrayOffsetBugExample {

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5};
        try {
            int result = showBug(exampleArray, 10); // This will cause IndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int offset) {
        // Unreachable switch statement
        int unreachableSwitchCondition = getCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be executed");
                break;
            case 2:
                System.out.println("This will never be executed");
                break;
            default:
                System.out.println("Default case");
                break;
        }
        
        // Attempt to access array with an out-of-bounds offset
        return array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }

    // Method to simulate a condition that makes the switch unreachable
    public static int getCondition() {
        return 0; // The switch cases will never be reached
    }
}