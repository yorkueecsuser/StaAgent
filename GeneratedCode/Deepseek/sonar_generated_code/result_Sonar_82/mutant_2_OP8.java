class Main {
    private static final int UPPER_RENAMED = 20;
    private static final int LOWER_RENAMED = 0;

    // BUG: Min and max used in combination should not always return the same value
    public int doRangeCheckRenamed(int num) {    // Let's say num = 12
        int resultRenamed = Math.min(LOWER_RENAMED, num);  // result = 0
        return Math.max(UPPER_RENAMED, resultRenamed);     // Noncompliant; result is now 20
    }

    public int showBug() {
        return doRangeCheckRenamed(12);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.showBug());
    }
}