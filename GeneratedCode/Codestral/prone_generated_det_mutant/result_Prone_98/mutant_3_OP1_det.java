class LenientFormatStringValidationBug {
    public String showBug(String name) {
        long fxmbkcss = 330433099;
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}