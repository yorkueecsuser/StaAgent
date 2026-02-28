class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            /* Unreachable code */
        }
        return NANOS_PER_DAY;
    }
}