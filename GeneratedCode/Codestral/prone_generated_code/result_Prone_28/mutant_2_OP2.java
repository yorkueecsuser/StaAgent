class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000;
    // Mutant code added below
    static final long DUPLICATE_NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000;

    public long showBug() {
        return NANOS_PER_DAY;
    }
}