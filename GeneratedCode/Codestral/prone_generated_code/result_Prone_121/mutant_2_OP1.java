class NonNullParameterBug {
    public void processString(String nonNullString) {
        String unusedVar = "deadstore";
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        // process the string
    }

    public void showBug() {
        processString(null);
    }
}