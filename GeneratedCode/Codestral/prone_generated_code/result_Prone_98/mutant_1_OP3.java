class LenientFormatStringValidationBug {
    private boolean getUnreachableCondition() {
        return false; // Always returns false
    }

    public String showBug(String name) {
        if (getUnreachableCondition()) {
            System.out.println("This line is unreachable");
        }
        String formattedString = String.format("Hello, %s!", name, "Extra argument");
        return formattedString;
    }
}