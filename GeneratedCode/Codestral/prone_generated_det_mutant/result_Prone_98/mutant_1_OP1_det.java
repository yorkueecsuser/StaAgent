class LenientFormatStringValidationBug {
    public String showBug(String name) {
        long uuwjtkjp = -127782544;
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}