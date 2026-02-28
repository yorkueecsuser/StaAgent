class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    static final long n = NANOS_PER_DAY; // Mutant code: Renamed variable

    public long showBug() {
        return n; // Mutant code: Using the new variable name
    }
}