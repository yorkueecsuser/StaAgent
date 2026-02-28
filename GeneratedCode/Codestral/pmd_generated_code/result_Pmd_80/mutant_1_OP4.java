class UnnecessaryCaseChangeBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")

        // MUTANT: Unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This line should never be executed");
        } else {
            System.out.println("This line is always executed");
        }

        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()

        // MUTANT: Unreachable if-else statement
        if (getFalseCondition()) {
            System.out.println("This line should never be executed");
        } else {
            System.out.println("This line is always executed");
        }

        return answer2;
    }
}