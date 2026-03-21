class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            if (true && false && false && true && true && false && false && false && false && true && false) {int kbqrdmrg = -921381188;}else{char jodqbspr = 'q';}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}