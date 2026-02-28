class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        // Duplicated assignment statement
        nonNullString = nonNullString;
        // process the string
    }

    public void showBug() {
        processString(null);
    }
}