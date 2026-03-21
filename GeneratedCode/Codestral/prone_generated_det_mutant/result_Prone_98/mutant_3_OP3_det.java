class LenientFormatStringValidationBug {
    public String showBug(String name) {
        if (false && true && false && false && false && false && true && false && false && true && false) {boolean mkixhejl = false;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}