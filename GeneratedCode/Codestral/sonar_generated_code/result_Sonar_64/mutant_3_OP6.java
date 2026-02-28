class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        // Mutation: Added unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }
    }

    private boolean getFalseCondition() {
        // This method always returns false
        return false;
    }
}