class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    static final long DUPLICATED_NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // Mutant: Duplicated assignment

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public long showMutant() {
        return DUPLICATED_NANOS_PER_DAY;
    }
}