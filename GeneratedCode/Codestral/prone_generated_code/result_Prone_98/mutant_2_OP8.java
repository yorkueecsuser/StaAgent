class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        String r = name; // Mutant: Renaming user-defined variable 'name' to 'r'
        return formattedString;
    }
}