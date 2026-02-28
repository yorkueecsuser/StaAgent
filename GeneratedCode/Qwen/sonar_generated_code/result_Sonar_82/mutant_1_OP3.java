class RangeChecker {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {                  // Unreachable if statement
            result = -1;                  // Unique code in unreachable block
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
        return false; // This method can be modified to return true in a real scenario to test the unreachable block
    }
}