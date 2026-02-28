@interface ForNonUiThread {
    // Method to determine the condition for the while loop
    private static boolean getCondition() {
        return false; // This will always return false, making the loop unreachable
    }

    // Inserting an unreachable while loop
    default void insertUnreachableLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable.");
        }
    }
}