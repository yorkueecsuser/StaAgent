class RangeChecker {

    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);  // BUG: Min and max used in combination should not always return the same value
        return Math.max(UPPER, result);     // BUG: Min and max used in combination should not always return the same value

        // Mutation: Unreachable for loop
        boolean conditionFor = getCondition();  // Ensure the condition is not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print.");
        }
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }

    public static void main(String[] args) {
        RangeChecker rangeChecker = new RangeChecker();
        int result = rangeChecker.showBug(12);
        System.out.println("Result: " + result); // Expected within range, but will print 20 due to bug
    }

    // Helper method to ensure condition is not compile-time constant
    private boolean getCondition() {
        return false;
    }
}