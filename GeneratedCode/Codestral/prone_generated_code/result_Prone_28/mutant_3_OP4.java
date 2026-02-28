class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // Original code

    public long showBug() {
        boolean unreachableCondition = false; // Added condition that is always false
        if (unreachableCondition) { // Unreachable if-else statement according to mutation operator
            throw new IllegalStateException("This code should not be executed");
        } else {
            return NANOS_PERDAY;
        }
    }
}