class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation

        // Added unreachable switch statement
        boolean condition = false;
        int value = getValue();
        if (condition) {
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("Unreachable code executed");
                    break;
            }
        }

        return formattedString;
    }

    // Method to dynamically determine the value for the switch statement
    private int getValue() {
        return 0; // Always return 0 to make the switch statement unreachable
    }
}