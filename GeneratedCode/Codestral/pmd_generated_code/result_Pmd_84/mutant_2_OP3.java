class StringComparison {
    public boolean checkString(String s) {
        // Original code
        if (s == "one") return true;

        // Mutant code
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code reached");
        }

        return false;
    }

    // Method to simulate getting a condition value
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }
}