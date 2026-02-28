class RangeChecker {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Unreachable if-else statement
            if (getUnreachableCondition()) {
                result = -1; // Some arbitrary code that would be unreachable
            } else {
                result = -2; // Another arbitrary code that would be unreachable
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
        // This method can return true or false based on some logic
        return false; // For demonstration purposes, this is set to false
    }

    private boolean getUnreachableCondition() {
        // This method should always return false to ensure the if-else is unreachable
        return false;
    }
}