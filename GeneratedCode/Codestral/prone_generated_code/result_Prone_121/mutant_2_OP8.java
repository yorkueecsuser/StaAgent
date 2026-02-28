class NonNullParameterBug {
    public void processString(String nonNullString) {
        String a = nonNullString; // Added for Renaming mutation operator
        if (a == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        // process the string
    }

    public void showBug() {
        processString(null);
    }
}