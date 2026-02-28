class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        if (getCondition()) { // Unreachable mutant
            throw new RuntimeException("Unreachable code executed");
        } else {
            return NANOS_PER_DAY;
        }
    }

    private boolean getCondition() {
        return false; // Always false to ensure unreachability
    }
}