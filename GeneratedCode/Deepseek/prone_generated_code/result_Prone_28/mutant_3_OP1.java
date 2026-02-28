class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        long deadStore = NANOS_PER_DAY; // Dead Store Mutation
        return NANOS_PER_DAY;
    }
}