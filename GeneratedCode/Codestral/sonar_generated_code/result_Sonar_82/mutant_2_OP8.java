class RangeCheckBug {
    private static final int a = 20;
    private static final int b = 0;

    public int doRangeCheck(int num) {
        int result = Math.min(b, num);
        return Math.max(a, result);
    }

    public int showBug(int num) {
        return doRangeCheck(num);
    }
}