class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public void addUnreachableLoop() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable loop
            System.out.println("This is an unreachable loop.");
        }
    }

    private boolean getCondition() {
        return false;
    }
}