class MinMaxBug {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(UPPER, num);
        result = Math.max(LOWER, result); // BUG: Min and max used in combination should not always return the same value
        return Math.max(LOWER, result); // Mutant: duplicate and insert immediately after
    }

    public static void main(String[] args) {
        MinMaxBug buggy = new MinMaxBug();
        System.out.println(buggy.doRangeCheck(12)); // prints 20
    }
}