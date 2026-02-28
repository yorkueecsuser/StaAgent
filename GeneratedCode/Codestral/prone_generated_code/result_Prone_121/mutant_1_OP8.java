class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        // process the string
    }

    public void showBug() {
        String str = null;
        processString(str);  // Mutant code: Renaming 'null' to'str'
    }
}