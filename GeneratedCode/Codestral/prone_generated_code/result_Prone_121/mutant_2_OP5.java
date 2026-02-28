class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }

        // Mutated Code: Add unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("This code should never run.");
                    break;
            }
        }

        // process the string
    }

    // Helper method to simulate a dynamic value for the switch
    private int getValue() {
        return 1;
    }

    public void showBug() {
        processString(null);
    }
}