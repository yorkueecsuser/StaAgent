class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            if (true && false && false && true && true && false && true && true && true && true && false) {int nbjxmobb = 237872047;}else{float siqnqjgp = 821849953;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}