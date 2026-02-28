class LenientFormatStringValidationBug {
    private boolean getUnreachableCondition() {
        // Dummy method to ensure unreachable condition
        return false;
    }

    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation

        // Mutant code - Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute");
        } else {
            // Alternative code
            System.out.println("This is the alternative code");
        }

        return formattedString;
    }
}