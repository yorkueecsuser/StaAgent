class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            if (false && true && true && true && true && false && false && false && true && false && false) {byte jdcjqhov = -9;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}