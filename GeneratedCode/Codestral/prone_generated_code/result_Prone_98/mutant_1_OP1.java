class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String unusedVariable = "deadStore";
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    }
}