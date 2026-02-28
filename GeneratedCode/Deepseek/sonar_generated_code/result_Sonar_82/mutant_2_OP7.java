class Main {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    // BUG: Min and max used in combination should not always return the same value
    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0

        // Mutant Code: Unreachable while loop
        boolean condition = false;
        while (condition) {
            condition = true;
        }

        return Math.max(UPPER, result);     // Noncompliant; result is now 20
    }

    public int showBug() {
        return doRangeCheck(12);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.showBug());
    }
}