class Main {
    private static final int UPPER = 20;
    private static final int LOWER = 0;

    private boolean neverTrue() {
        return false;
    }

    // BUG: Min and max used in combination should not always return the same value
    public int doRangeCheck(int num) {    // Let's say num = 12
        int result = Math.min(LOWER, num);  // result = 0
        return Math.max(UPPER, result);     // Noncompliant; result is now 20
    }

    public int showBug() {
        if (neverTrue()) {
            doRangeCheck(12);
        } else {
            int zero = 0;
        }
        return doRangeCheck(12);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.showBug());
    }
}