class LenientFormatStringValidationBug {
    private static boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument");

        // Inserted unreachable while loop
        while (getUnreachableCondition()) {
            int i = 0;
            i++; // Dummy statement to avoid empty loop error
        }

        return formattedString;
    }
}