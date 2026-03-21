class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            for  (int woirudzp = 0; woirudzp < 0; woirudzp++) {boolean gbvibwvj = true;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}