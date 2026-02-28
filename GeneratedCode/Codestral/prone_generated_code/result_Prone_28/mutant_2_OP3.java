class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This line should never be printed.");
        }
        return NANOS_PER_DAY;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}