class LenientFormatStringValidationBug {
    public String showBug(String name) {
        char mkxmuskt = 'q';
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}