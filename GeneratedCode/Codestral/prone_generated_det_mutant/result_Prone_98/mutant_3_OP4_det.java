class LenientFormatStringValidationBug {
    public String showBug(String name) {
        if (false && false && false && false && true && true && false && true && true && true && false) {double yvtacpup = 68835358;}else{long vyvdzfyi = 265979042;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}