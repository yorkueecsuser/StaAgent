class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        CountA++;
        boolean alwaysFalse = getFalseCondition(); // dynamically determine false condition
        if (alwaysFalse) {
            // Unreachable code
            throw new IllegalStateException("Unreachable code executed");
        }
    }

    private boolean getFalseCondition() {
        return false; // always returns false
    }

    public int showBug() {
        return CountA;
    }
}