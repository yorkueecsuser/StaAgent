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

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(12);
        System.out.println("Result: " + result); // Expected within range, but will print 20 due to bug

        // Inserting unreachable if-else statement
        boolean shouldRun = rangeChecker.getCondition();
        if (shouldRun) {
            System.out.println("This branch will never execute.");
        } else {
            System.out.println("This is the else branch.");
        }
    }
}