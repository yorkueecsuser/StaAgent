class LenientFormatStringValidationBug {
    private boolean getCondition() {
        return false;   // Method to get the false condition
    }

    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument");

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable branch
            System.out.println("This line should never execute!");
        }

        return formattedString;
    }
}