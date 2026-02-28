class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        // process the string

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = getMutantCondition();
        if (shouldRun) {
            System.out.println("This is an unreachable statement");
        } else {
            System.out.println("This else block is also unreachable");
        }
    }

    // Method to simulate dynamic condition for the mutant
    private boolean getMutantCondition() {
        return false;
    }

    public void showBug() {
        processString(null);
    }
}