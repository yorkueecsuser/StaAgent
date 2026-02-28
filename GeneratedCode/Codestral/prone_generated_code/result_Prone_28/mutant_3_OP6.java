class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This loop is unreachable");
        }
        return NANOS_PER_DAY;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}