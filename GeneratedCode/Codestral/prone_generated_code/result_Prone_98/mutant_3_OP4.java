class LenientFormatStringValidationBug {
    private boolean getCondition() {
        return false; // Always returns false to make the if-else branch unreachable
    }

    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation

        // Mutant code: Unreachable if-else statement
        if (getCondition()) {
            // This code will never be executed
            System.out.println("This is an unreachable block.");
        } else {
            // This block will always be executed as the condition is always false
            System.out.println("This is the reachable block.");
        }

        return formattedString;
    }
}