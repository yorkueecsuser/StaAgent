class RangeChecker {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);  // BUG: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value
    }

    public int showBug(int num) {
        // Inserting an unreachable while loop as a mutation
        boolean unreachableWhile = getUnreachableCondition(); // Non-final variable used for the condition
        while (unreachableWhile) {
            System.out.println("This is unreachable code.");
        }

        return doRangeCheck(num);
    }

    // Helper method to provide a non-final condition for the unreachable while loop
    private boolean getUnreachableCondition() {
        return false; // Runtime evaluated as false, making the loop unreachable
    }

    public static void main(String[] args) {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(12);
        System.out.println("Result: " + result); // Expected within range, but will print 20 due to bug
    }
}