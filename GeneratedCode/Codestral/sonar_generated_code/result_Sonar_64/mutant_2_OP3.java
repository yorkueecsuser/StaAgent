class BuggyExceptionCreation {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        // Mutant code: Adding an unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This code should never run");
        }
    }
}