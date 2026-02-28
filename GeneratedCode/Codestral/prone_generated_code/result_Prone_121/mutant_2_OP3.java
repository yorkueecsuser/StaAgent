class NonNullParameterBug {
    private boolean getFalseCondition() {
        return false;
    }

    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }

        // Adding an unreachable if statement
        if (getFalseCondition()) {
            System.out.println("This line will never be executed");
        }

        // process the string
    }

    public void showBug() {
        processString(null);
    }
}