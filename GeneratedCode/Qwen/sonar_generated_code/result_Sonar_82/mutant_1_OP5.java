class RangeChecker {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        switch (condition? 0 : 1) { // This switch will always be 1, making it effectively unreachable
            case 0:
                result = -1; // Unreachable code
                break;
            case 1:
                // Intentionally left empty to make case 0 unreachable
                break;
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
        return false; // This method returns false, but the switch condition uses it dynamically
    }
}