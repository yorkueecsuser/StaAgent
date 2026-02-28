class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // BUG: InvalidPatternSyntax
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                break;
            // Add more cases as needed
        }

        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }

    private int getUnreachableValue() {
        return -1; // This value does not match any case in the switch statement
    }
}