class LenientFormatStringValidationBug {
    public String showBug(String name) {
        for  (int kbofccxn = 0; kbofccxn < 0; kbofccxn++) {int qbjsjcpu = 125762505;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}