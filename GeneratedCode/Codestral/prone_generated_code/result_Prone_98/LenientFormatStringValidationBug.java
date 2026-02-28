class LenientFormatStringValidationBug {
    public String showBug(String name) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This while loop is unreachable as the condition is always false
            System.out.println("Unreachable code");
        }
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    }

    public boolean getCondition() {
        return false;
    }
}