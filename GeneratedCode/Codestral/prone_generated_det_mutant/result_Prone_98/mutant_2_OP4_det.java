class LenientFormatStringValidationBug {
    public String showBug(String name) {
        if (true && true && false && false && true && true && false && true && true && false && false) {long rdvmiznu = -13049815;}else{double hbjivqja = -650751911;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}