class RangeChecker {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);  // BUG: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(12);
        System.out.println("Result: " + result); // Expected within range, but will print 20 due to bug
        
        // Inserted unreachable if-else statement
        boolean condition = rangeChecker.getCondition();
        if (condition) {
            System.out.println("This branch is unreachable because condition is always false.");
        } else {
            // This is the branch that will always execute
            System.out.println("This branch is always executed because the condition is false.");
        }
    }
}