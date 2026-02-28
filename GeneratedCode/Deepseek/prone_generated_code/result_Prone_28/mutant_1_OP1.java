class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    int unusedVar = 0; // Mutation: Dead Store

    public long showBug() {
        return NANOS_PER_DAY;
    }
}