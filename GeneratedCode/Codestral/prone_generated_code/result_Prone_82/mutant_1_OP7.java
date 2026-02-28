class InvalidPatternSyntaxBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop mutant");
        }

        // Original code
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }
}