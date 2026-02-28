class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }

        // Mutant: Unreachable switch statement
        boolean condition = false;
        if (condition) {
            int value = 1;
            switch (value) {
                case 2:
                    // This case is unreachable
                    System.out.println("This line should never execute");
                    break;
                default:
                    break;
            }
        }

        // Rest of the original code
        // process the string
    }

    public void showBug() {
        processString(null);
    }

    // Helper method to dynamically determine the condition
    private boolean getCondition() {
        return false;
    }
}