class RangeChecker {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition? 0 : 1) {  // This switch statement is unreachable because condition is never true
            case 0:
                result = -1;  // This code will never be executed
                break;
            default:
                result = -2;  // This code will also never be executed
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

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}