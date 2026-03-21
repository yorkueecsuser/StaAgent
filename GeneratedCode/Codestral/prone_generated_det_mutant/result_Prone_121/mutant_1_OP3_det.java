class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            if (false && true && false && true && false && true && true && true && false && false && false) {String xwouuhiv = "sdcvbbtv";}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}