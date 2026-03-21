class LenientFormatStringValidationBug {
    public String showBug(String name) {
        int usyvfuwk = 0;switch  (usyvfuwk) {case 1:char npsbubln = 'd';break;default:double vtelgmaj = -746365668;break;}
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    
}
}