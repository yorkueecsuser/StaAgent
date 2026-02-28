class RangeCheckBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    private static boolean alwaysFalse() {
        return false;
    }

    public int doRangeCheck(int num) {
        if (alwaysFalse()) {
            // Unreachable code
            System.out.println("This code should never be executed");
        }
        int result = Math.min(LOWER, num);
        return Math.max(UPPER, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}