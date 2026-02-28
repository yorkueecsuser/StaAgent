class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(UPPER, num);
        return Math.max(LOWER, result); // BUG: Min and max used in combination should not always return the same value
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }

    // Unreachable for loop mutant
    public int doRangeCheck(int num) {
        int result = Math.min(UPPER, num);
        for (int i = 0; false; i++) {
            // Unreachable code
            result = Math.max(LOWER, result);
        }
        return result;
    }
}