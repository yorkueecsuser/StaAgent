class RangeChecker {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value

        // Inserted unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
            case 1:
                // This case is unreachable because getCondition() always returns false
                result = -1;
                break;
            default:
                // Default case is also unreachable due to the same reason
                result = -2;
                break;
        }
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    public static void main(String[] args) {
        RangeChecker checker = new RangeChecker();
        System.out.println(checker.showBug(12)); // This will print 20, demonstrating the bug
    }

    // Method to provide a dynamic condition that always evaluates to false
    private boolean getCondition() {
        return false;
    }
}