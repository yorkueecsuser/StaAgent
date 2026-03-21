class LenientFormatStringValidationBug {
    public String showBug(String name) {
        if (true && true && true && true && false && false && false && false && false && false && false) {short nmefzesq = -4705;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}