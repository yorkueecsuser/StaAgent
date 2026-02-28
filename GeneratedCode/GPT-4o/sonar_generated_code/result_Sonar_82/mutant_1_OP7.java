class RangeChecker {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        // Inserting an unreachable while loop
        boolean unreachableCondition = getFalseCondition();
        while (unreachableCondition) {
            System.out.println("This is an unreachable block");
        }
        
        int result = Math.min(LOWER, num);  // BUG: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value
    }

    private boolean getFalseCondition() {
        return false;  // Method returns a false condition to ensure the while loop is unreachable
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    public static void main(String[] args) {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(12);
        System.out.println("Result: " + result); // Expected within range, but will print 20 due to bug
    }
}