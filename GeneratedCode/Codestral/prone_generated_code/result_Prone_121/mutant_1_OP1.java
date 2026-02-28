class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        // process the string
        // Dead Store mutation added below
        String deadStoreVariable = "useless";
    }

    public void showBug() {
        processString(null);
    }
}