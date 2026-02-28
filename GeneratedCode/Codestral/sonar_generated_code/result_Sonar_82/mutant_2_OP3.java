class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        unreachableBranch();
        return Math.max(UPPER, result);
    }

    private void unreachableBranch() {
        boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            // This branch is unreachable
            System.out.println("This line will never be executed.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if condition unreachable
        return false;
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}