class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    private boolean getCondition() {
        return false;
    }

    public int doRangeCheck(int num) {
        int result = Math.min(LOWER, num);
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Added unreachable for loop
            System.out.println("Unreachable code");
        }
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}