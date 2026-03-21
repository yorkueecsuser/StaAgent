class LenientFormatStringValidationBug {
    public String showBug(String name) {
        for  (int tgmpcmfq = 0; tgmpcmfq < 0; tgmpcmfq++) {float ybecktyn = 7532615;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}