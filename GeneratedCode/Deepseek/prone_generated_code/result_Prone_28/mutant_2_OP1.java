class ConstantOverflow {
    // Dead store Mutation starts here
    private static final String AAAAAAAA = "This is a dead store";
    // Dead store Mutation ends here

    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }
}