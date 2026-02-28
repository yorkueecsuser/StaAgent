class NonNullParameterBug {
    public void processString(String nonNullString) {
        String s = nonNullString; // Mutated code: Renamed nonNullString to s

        if (s == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        // process the string
    }

    public void showBug() {
        processString(null);
    }
}