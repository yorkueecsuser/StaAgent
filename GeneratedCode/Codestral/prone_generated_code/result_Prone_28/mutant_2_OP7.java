class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    private boolean getFalseCondition() {
        return false;
    }

    public long showBug() {
        while(getFalseCondition()) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop");
        }
        return NANOS_PER_DAY;
    }
}