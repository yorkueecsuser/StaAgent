class RegularExpressionBug {
    public String showBug(String input) {
        String output = input.replace(".", "|"); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)

        // Mutation: Unreachable if statement
        boolean unreachableCondition = alwaysFalse();
        if (unreachableCondition) {
            System.out.println("This line should never be executed");
        }

        return output;
    }

    private boolean alwaysFalse() {
        return false;
    }
}