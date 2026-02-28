class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    private boolean getUnreachableCondition() {
        return false;
    }

    public int doRangeCheck(int num) {
        if(getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This is an unreachable branch");
        }
        int result = Math.min(LOWER, num);
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}