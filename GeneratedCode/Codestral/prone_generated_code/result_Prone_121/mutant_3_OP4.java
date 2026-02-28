class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }

        // Inserted unreachable if-else branch
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            System.out.println("This line will never be printed");
        } else {
            // This else block will never be executed
            System.out.println("This is an unreachable block");
        }

        // process the string
    }

    public void showBug() {
        processString(null);
    }

    private boolean getCondition() {
        return false;
    }
}