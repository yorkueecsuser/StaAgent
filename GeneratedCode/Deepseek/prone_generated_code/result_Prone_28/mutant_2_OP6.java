class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow
    boolean condition = getCondition(); // Mutant Code: Adding variable condition for making for loop unreachable

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public boolean getCondition() {
        return true; // Mutant Code: Method for returning true
    }

    public void mutant() {
        for (int i = 0; condition; i++) { // Mutant Code: Unreachable for loop
            // do nothing
        }
    }
}