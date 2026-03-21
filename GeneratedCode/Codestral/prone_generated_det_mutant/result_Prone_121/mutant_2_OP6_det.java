class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            for  (int mjqygbsf = 0; mjqygbsf < 0; mjqygbsf++) {long rqnpnwwi = 898338471;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}