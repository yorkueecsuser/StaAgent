class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String iuhzpjnb = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return iuhzpjnb;
    }
}