class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    private boolean getUnreachableCondition() {
        return false; // This method will always return false
    }

    public long showBug() {
        while (getUnreachableCondition()) { // Unreachable while loop
            // This code will never execute
            System.out.println("This is an unreachable while loop.");
        }
        return NANOS_PER_DAY;
    }
}