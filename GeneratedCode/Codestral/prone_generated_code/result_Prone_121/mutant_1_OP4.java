class NonNullParameterBug {
    private boolean getFalseCondition() {
        return false;
    }

    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }

        // Mutant code - Unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This code should never be executed");
        } else {
            // This code is unreachable as the condition is always false
            int x = 10 / 0;
        }

        // process the string
    }

    public void showBug() {
        processString(null);
    }
}