class LenientFormatStringValidationBug {
    public String showBug(String name) {
        if (false && false && true && false && false && true && false && true && false && true && false) {boolean gqzrkefr = true;}else{char kvyiclih = 'r';}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}