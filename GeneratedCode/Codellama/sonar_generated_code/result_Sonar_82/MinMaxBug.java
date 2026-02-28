class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(UPPER, num);
        boolean condition = getCondition();
        while (condition) {
            // Unreachable while loop
        }
        return Math.max(LOWER, result); // BUG: Min and max used in combination should not always return the same value
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}