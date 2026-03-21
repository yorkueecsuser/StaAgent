class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String jkluushh = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return jkluushh;
    }
}