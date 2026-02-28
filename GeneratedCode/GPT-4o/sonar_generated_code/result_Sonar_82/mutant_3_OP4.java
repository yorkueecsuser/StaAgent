class RangeChecker {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);  // BUG: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value
    }

    public int showBug(int num) {
        // Applying the Mutation Operator: Unreachable if-else statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("Proceeding with the original logic.");
        }
        
        return doRangeCheck(num);
    }

    // Method to return a false condition, ensuring runtime evaluation
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(12);
        System.out.println("Result: " + result); // Expected within range, but will print 20 due to bug
    }
}