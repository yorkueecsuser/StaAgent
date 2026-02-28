class LenientFormatStringValidationBug {
    public String showBug(String name) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This is an unreachable loop");
        }
        String formattedString = String.format("Hello, %s!", name, "Extra argument");
        return formattedString;
    }
}