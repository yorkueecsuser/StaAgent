class LenientFormatStringValidationBug {
    public String showBug(String name) {
        int raphruac = 0;switch  (raphruac) {case 1:int bbzjwzlz = 494737996;break;default:long thcbhmbd = 460161166;break;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}