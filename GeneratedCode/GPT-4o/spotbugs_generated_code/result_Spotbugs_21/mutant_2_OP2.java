class ValueLimiter {

    public static double showBug(double value) {
        // Attempting to limit the value between 0 and 100, but incorrectly implemented.
        return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static void main(String[] args) {
        double result1 = showBug(50);
        System.out.println("Result for value 50: " + result1); // Should be 50, but results in 0
        double result2 = showBug(-20);
        System.out.println("Result for value -20: " + result2); // Should be 0, but results in 0
        double result3 = showBug(150);
        System.out.println("Result for value 150: " + result3); // Should be 100, but results in 0
        
        // Mutation: Duplicate assignment statements
        result1 = result1; // Duplicated assignment statement
        result2 = result2; // Duplicated assignment statement
        result3 = result3; // Duplicated assignment statement
    }
}