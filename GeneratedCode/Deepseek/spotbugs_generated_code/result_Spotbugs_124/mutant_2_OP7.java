class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)

        // Mutation: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line will never execute");
        }

        return output;
    }

    // Helper method to return the condition for the while loop
    private boolean getCondition() {
        return false;
    }
}