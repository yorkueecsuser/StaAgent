class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;

    public long showBug() {
        boolean loopCondition = getCondition();
        while(loopCondition) {
            // Adding an unreachable loop to avoid unreachable statement error
        }
        return NANOS_PER_DAY;
    }

    public boolean getCondition() {
        return false; // Non-final variable used to avoid compile-time constants
    }
}