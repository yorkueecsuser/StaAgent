class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
        }

        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
        }

        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()
        return answer2;
    }

    private boolean getCondition() {
        return false;   // This method always returns false to make the loop unreachable
    }
}