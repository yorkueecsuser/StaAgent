class ValueLimiter {

    public static double showBug(double value) {
        // Attempting to limit the value between 0 and 100, but incorrectly implemented.
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable due to the condition being always false.");
        }
        return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Result for value 50: " + showBug(50)); // Should be 50, but results in 0
        System.out.println("Result for value -20: " + showBug(-20)); // Should be 0, but results in 0
        System.out.println("Result for value 150: " + showBug(150)); // Should be 100, but results in 0
    }
}