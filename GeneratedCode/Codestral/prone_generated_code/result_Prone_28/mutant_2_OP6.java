class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    private boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public long showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
        }
        return NANOS_PER_DAY;
    }
}