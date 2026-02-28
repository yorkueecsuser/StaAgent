class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(UPPER, num);
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code
            result = Math.max(LOWER, result);
        }
        return result;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}