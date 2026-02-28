class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;
    static final long NANOS_PER_DAY_MUTANT = 24 * 60 * 60 * 1000 * 1000 * 1000; // Mutated variable

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public long showBugMutant() {  // Mutated function
        return NANOS_PER_DAY_MUTANT;
    }
}