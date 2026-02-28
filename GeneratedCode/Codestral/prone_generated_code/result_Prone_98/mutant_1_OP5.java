class LenientFormatStringValidationBug {
    private int getValue() {
        return 0; // This method always returns 0, making the switch statement unreachable
    }

    public String showBug(String name) {
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This line should never be executed.");
                break;
            default:
                // Original code
                break;
        }

        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation
        return formattedString;
    }
}