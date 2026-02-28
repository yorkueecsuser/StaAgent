class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    static final long NANOS_PER_DAY_DUPLICATE = 24  * 60 * 60 * 1000 * 1000 * 1000; // Duplicate of the BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }
}