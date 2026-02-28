class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    static final long n = NANOS_PER_DAY; // Mutant: Renaming user-defined variable

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public long showMutant() {
        return n; // Using the renamed variable
    }
}