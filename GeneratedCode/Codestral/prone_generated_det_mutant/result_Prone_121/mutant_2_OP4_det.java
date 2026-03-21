class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            if (true && false && false && false && false && false && false && false && false && false && false) {float rxpclhei = 736765713;}else{char nevglwum = 't';}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}