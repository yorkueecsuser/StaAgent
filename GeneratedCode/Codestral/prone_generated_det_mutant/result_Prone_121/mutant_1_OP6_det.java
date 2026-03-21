class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            for  (int ezsuzoqj = 0; ezsuzoqj < 0; ezsuzoqj++) {String ycjvhrrm = "cshjrksl";}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}