class LenientFormatStringValidationBug {
    public String showBug(String name) {
        if (false && true && false && true && true && true && false && true && false && true && false) {byte nwxlowko = 63;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}