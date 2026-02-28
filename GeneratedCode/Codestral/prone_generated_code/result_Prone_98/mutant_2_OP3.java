class LenientFormatStringValidationBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation

        if (getUnreachableCondition()) {
            // Unreachable code
            int x = 10;
            x = x / 0; // This line will cause an ArithmeticException if the condition becomes true (which will never happen)
        }

        return formattedString;
    }
}