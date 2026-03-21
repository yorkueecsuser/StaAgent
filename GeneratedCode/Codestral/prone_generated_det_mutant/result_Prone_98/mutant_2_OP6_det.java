class LenientFormatStringValidationBug {
    public String showBug(String name) {
        for  (int salnpenr = 0; salnpenr < 0; salnpenr++) {short aphjnzob = 4168;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}