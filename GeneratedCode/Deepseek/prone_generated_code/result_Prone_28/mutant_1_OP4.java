class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public boolean getCondition() { // Mutation: Adding unreachable if-else branch
        boolean condition = false;
        if (condition) {
            System.out.println("This line will never be executed."); // Unreachable code
        } else {
            System.out.println("This is an unreachable branch."); // Unreachable code
        }
        return condition;
    }
}