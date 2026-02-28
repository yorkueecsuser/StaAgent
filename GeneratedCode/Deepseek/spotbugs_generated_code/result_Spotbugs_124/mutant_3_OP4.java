class RegularExpressionBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String input) {
        String output = input.replace(".", "|"); // Original bug

        // Mutant code
        if (getCondition()) {
            // This if block is unreachable
            String unreachableOutput = input.replace("|", ".");
        } else {
            // This else block is executed
            String alternativeOutput = input.replace("|", "/");
        }

        return output;
    }
}