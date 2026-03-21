class LenientFormatStringValidationBug {
    public String showBug(String name) {
        int ybuwxwnm = 0;switch  (ybuwxwnm) {case 1:float tuibdifp = -335281179;break;default:short xgwzwiek = 6351;break;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}