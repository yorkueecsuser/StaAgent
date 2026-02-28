class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        boolean condition = false;
        if (condition) {
            // Incorrect: if (false) { /* code */ }
            // Empty block is added to make the if statement unreachable.
        }
        return NANOS_PER_DAY;
    }
}