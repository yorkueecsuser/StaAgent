class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            boolean udhnbvoj = false;while (udhnbvoj && false && true && false && false && true && true && false && true && false && false && false) {byte mfpedygd = 46;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}