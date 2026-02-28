class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }

        // Insert unreachable for loop
        boolean shouldRun = getCondition();
        for (int i = 0;!shouldRun; i++) {
            // This loop is unreachable as the condition is always false
            System.out.println("Unreachable code");
        }

        // process the string
    }

    public void showBug() {
        processString(null);
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}