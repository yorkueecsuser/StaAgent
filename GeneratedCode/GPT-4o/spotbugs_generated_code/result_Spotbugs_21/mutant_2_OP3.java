class ValueLimiter {

    public static double showBug(double value) {
        // Attempting to limit the value between 0 and 100, but incorrectly implemented.
        return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static void main(String[] args) {
        // Adding an unreachable if statement using a dynamically determined condition
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This branch will never be executed.");
        }

        System.out.println("Result for value 50: " + showBug(50)); // Should be 50, but results in 0
        System.out.println("Result for value -20: " + showBug(-20)); // Should be 0, but results in 0
        System.out.println("Result for value 150: " + showBug(150)); // Should be 100, but results in 0
    }

    private static boolean getFalseCondition() {
        return false; // Method returns false, making the if statement unreachable
    }
}