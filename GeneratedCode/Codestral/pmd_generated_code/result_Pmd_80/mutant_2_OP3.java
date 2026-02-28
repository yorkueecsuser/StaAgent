class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // should be buz.equalsIgnoreCase("BAZ")

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is an unreachable block");
        }

        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // another unnecessary toUpperCase()

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is an unreachable block");
        }

        return answer2;
    }

    private boolean getFalseCondition() {
        // A method that returns a constant false value
        return false;
    }
}