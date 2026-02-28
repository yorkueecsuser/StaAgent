class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation

        // Mutant code - Unreachable switch statement
        boolean condition = false;
        int value = getValue();
        if (condition) {
            switch(value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }

        return formattedString;
    }

    private int getValue() {
        // This method always returns a value that won't match the case statement in the switch
        return 0;
    }
}