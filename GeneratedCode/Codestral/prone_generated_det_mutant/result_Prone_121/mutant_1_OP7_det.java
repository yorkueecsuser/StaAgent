class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            boolean npxhexbq = false;while (npxhexbq && true && true && false && true && true && false && false && false && true && true && false) {byte wjdpozuc = -107;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}