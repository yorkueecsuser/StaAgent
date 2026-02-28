class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        boolean unreachableCondition = getUnreachableCondition(); // Correct usage of false in loop condition
        while (unreachableCondition) {
            // This loop is unreachable as the condition is always false
        }
        // process the string
    }

    public void showBug() {
        processString(null);
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }
}