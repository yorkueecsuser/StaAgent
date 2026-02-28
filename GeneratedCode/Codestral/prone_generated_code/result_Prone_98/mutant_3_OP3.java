class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument");
        // Mutant code: unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This line should never be executed.");
        }
        return formattedString;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the condition unreachable
        return false;
    }
}