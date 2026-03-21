class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String scaverml = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return scaverml;
    }
}