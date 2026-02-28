class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    static final long NANOS_PER_DAY_DUPLICATE = 24 * 60 * 60 * 1000 * 1000 * 1000; 

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public long showDuplicateBug() {
        return NANOS_PER_DAY_DUPLICATE;
    }
}