class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // Unreachable code
            throw new IllegalStateException("This block should not be executed!");
        } else {
            // Original code
            return NANOS_PER_DAY;
        }
    }

    private boolean getCondition() {
        // This method is always returning false to make the if condition unreachable
        return false;
    }
}