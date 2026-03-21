class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            if (false && true && false && false && false && false && true && false && true && false && false) {double gmjmcwib = 973013905;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}