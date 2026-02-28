class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    private boolean condition = false; // Mutated code

    public long showBug() {
        while (condition) { // Mutated code
            // Empty loop to avoid the condition becoming unreachable
        }
        return NANOS_PER_DAY;
    }
}