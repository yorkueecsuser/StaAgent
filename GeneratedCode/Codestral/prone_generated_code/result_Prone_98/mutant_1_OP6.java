class LenientFormatStringValidationBug {
    public String showBug(String name) {
        String formattedString = String.format("Hello, %s!", name, "Extra argument"); // BUG: LenientFormatStringValidation

        // Mutation: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed.");
        }

        return formattedString;
    }
}