class LenientFormatStringValidationBug {
    public String showBug(String inputName) {
        String formattedString = String.format("Hello, %s!", inputName, "Extra argument"); // BUG: LenientFormatStringValidation
        String outputString = formattedString;
        return outputString;
    }
}