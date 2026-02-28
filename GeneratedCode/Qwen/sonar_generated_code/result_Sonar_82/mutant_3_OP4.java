class RangeChecker {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Unreachable if-else statement
            if (getUnreachableCondition()) {
                result = -1; // This line is unreachable
            } else {
                result = -2; // This line is also unreachable
            }
        }
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    public static void main(String[] args) {
        RangeChecker checker = new RangeChecker();
        System.out.println(checker.showBug(12)); // This will print 20, demonstrating the bug
    }

    private boolean getCondition() {
        return false; // This ensures the if block is not executed
    }

    private boolean getUnreachableCondition() {
        return false; // This ensures the inner if-else block is not executed
    }
}