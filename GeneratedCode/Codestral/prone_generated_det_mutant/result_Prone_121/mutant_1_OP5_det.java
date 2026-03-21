class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            int ydxvyjsr = 0;switch  (ydxvyjsr) {case 1:byte jcksxkvf = -25;break;default:float lovtaasn = 122606468;break;}
            throw new IllegalArgumentException("NonNullString parameter cannot be null"); // BUG: NullArgumentForNonNullParameter
        }
        // process the string
    
}

    public void showBug() {
        processString(null);
    }
}