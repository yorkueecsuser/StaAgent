class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            int zbqxhera = 0;switch  (zbqxhera) {case 1:byte eqgdcewn = -32;break;default:boolean dllvfknf = true;break;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}