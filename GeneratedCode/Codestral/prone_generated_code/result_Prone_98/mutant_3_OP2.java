class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // Original line
        String duplicatedString = formattedString; // Added line: Duplication of assignment statement
        return formattedString;
    }
}