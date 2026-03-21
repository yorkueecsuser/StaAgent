class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            boolean jrxezuqx = false;while (jrxezuqx && false && false && false && true && true && false && true && true && false && false && false) {short tdugguhm = -5940;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}