class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }

    public long showBug() {
        if (getCondition()) { // Added unreachable if statement
            System.out.println("This line should never be executed.");
        }
        return NANOS_PER_DAY;
    }
}