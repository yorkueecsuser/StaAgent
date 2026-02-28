class UnnecessaryCaseChangeBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")

        // Mutant code: Unreachable if-else statement
        if (getFalseCondition()) {
            // Unreachable code: This block will never be executed
            int x = 10 / 0; // This will throw an exception if the code is executed
        } else {
            // This block is always executed
            answer1 = answer1 || false;
        }

        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()

        // Mutant code: Unreachable if-else statement
        if (getFalseCondition()) {
            // Unreachable code: This block will never be executed
            System.out.println("This line will never be printed");
        } else {
            // This block is always executed
            answer2 = answer2 && true;
        }

        return answer2;
    }
}