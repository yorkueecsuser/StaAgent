class StringComparison {
    public boolean checkString(String s) {
        if (s == "one") return true; // Original code

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable code block");
        }

        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }

    // Helper method to return a false condition
    private boolean getUnreachableCondition() {
        return false;
    }
}