class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String n = name;
        String formattedString = String.format("Hello, %s!", n, "Extra argument");
        return formattedString;
    }
}