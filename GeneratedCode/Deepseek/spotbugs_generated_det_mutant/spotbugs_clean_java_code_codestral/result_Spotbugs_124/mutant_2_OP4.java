class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)

        // Mutated code: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never be executed
            System.out.println("This line will never be printed");
        } else {
            // This block will also never be executed
            System.out.println("Neither will this line");
        }

        return output;
    }

    // Method to dynamically determine the condition
    private boolean getCondition() {
        return false;
    }
}