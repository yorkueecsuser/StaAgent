class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // Original code
        String duplicatedFormattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: Duplication
        return formattedString;
    }
}