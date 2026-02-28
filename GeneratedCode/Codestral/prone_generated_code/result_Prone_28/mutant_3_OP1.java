class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        int deadStoreVariable = 10; // dead store variable declaration
        return NANOS_PER_DAY;
    }
}