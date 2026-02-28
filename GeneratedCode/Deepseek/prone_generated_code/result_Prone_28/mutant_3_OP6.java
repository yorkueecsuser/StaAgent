class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public void addUnreachableForLoop() {
        boolean condition = false;
        for(;condition;) {
            // This is an unreachable loop, it will never run
        }
    }
}