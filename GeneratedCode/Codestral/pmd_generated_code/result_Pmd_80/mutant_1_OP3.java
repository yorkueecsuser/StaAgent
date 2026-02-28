class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        if (getUnreachableCondition()) { // Mutant: Unreachable if statement
            throw new RuntimeException("This line should never be executed.");
        }
        return answer1;
    }

    private boolean getUnreachableCondition() {
        return false; // This condition is always false, making the if block unreachable
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        if (getAnotherUnreachableCondition()) { // Mutant: Unreachable if statement
            throw new RuntimeException("This line should never be executed.");
        }
        return answer2;
    }

    private boolean getAnotherUnreachableCondition() {
        return false; // This condition is always false, making the if block unreachable
    }
}