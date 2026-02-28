class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            boolean unreachable = getCondition();
            for (int i = 0; unreachable; i++) { // unreachable loop
                continue;
            }
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    }

    public boolean getCondition() {
        return false;
    }

    public void showBug() {
        processString(null);
    }
}