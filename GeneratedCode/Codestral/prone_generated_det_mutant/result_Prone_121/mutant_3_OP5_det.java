class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            int bfkgekcu = 0;switch  (bfkgekcu) {case 1:char aqqyfbph = 'a';break;default:char exzrqikv = 'h';break;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}