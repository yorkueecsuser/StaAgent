class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    private boolean condition = false;

    public long showBug() {
        if (condition) {
            return NANOS_PER_DAY;
        } else {
            return 0;
        }
    }
}