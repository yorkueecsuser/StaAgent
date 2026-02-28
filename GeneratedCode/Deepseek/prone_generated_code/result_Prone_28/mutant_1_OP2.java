class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    static final long NANOS_PER_DAY_MUTANT = 24 * 60 * 60 * 1000 * 1000 * 1000; // Mutant: Added duplicate constant

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public long showMutant() {
        return NANOS_PER_DAY_MUTANT;
    }
}