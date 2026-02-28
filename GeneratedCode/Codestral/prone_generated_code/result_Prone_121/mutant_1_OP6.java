class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }

        // Mutant code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block of code is unreachable
            System.out.println("Unreachable code executed");
        }

        // process the string
    }

    public void showBug() {
        processString(null);
    }

    // Method to return false for the unreachable loop
    private boolean getCondition() {
        return false;
    }
}