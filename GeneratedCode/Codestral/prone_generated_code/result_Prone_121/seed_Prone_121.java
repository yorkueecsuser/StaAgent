class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    }

    public void showBug() {
        processString(null);
    }
}