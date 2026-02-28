// BUG: INTEGER_OVERFLOW_U5
class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        boolean conditionWhile = getCondition(); // Assume this method is defined elsewhere and returns false
        while (conditionWhile) {
            // This loop is unreachable because the condition is always false
        }
        return x + y;
    }

    // Method to simulate the condition for the while loop
    private static boolean getCondition() {
        return false;
    }
}