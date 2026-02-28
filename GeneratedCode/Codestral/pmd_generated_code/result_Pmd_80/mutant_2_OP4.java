class UnnecessaryCaseChangeBug {
    private boolean getFalseCondition() {
        // Added method to generate non-final false value
        return false;
    }

    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        if (getFalseCondition()) { // Unreachable if-else statement mutant
            System.out.println("This line should never be executed!");
        }
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        if (getFalseCondition()) { // Another unreachable if-else statement mutant
            System.out.println("This line should never be executed either!");
        }
        return answer2;
    }
}