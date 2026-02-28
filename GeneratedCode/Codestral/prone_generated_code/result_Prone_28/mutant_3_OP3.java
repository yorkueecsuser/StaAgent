class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    private static boolean getCondition() {
        return false;
    }

    public long showBug() {
        if (getCondition()) {
            // unreachable code
            System.out.println("This code will never be executed.");
        }
        return NANOS_PER_DAY;
    }
}