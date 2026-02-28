class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000;

    private boolean getUnreachableCondition() {
        return false;
    }

    public long showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This loop will never be executed
            System.out.println("This is an unreachable loop");
        }
        return NANOS_PER_DAY;
    }
}