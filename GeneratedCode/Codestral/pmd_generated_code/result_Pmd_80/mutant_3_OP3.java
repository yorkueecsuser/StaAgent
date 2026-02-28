class UnnecessaryCaseChangeBug {
    private static boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        if (getFalseCondition()) {
            // Mutant: Unreachable if statement
            System.out.println("This line should not be executed.");
        }
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        if (getFalseCondition()) {
            // Mutant: Unreachable if statement
            System.out.println("This line should not be executed.");
        }
        return answer2;
    }
}