class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        String duplicateFormattedString = String.format("Hello, %s!", name, "Extra argument"); // Added mutant: Duplication
        return formattedString;
    }
}