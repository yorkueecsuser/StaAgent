class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        nonNullString = nonNullString; // Mutant: Duplicated assignment statement
        // process the string
    }

    public void showBug() {
        processString(null);
    }
}