class StringComparison {
    public boolean checkString(String s) {
        boolean shouldRun = getCondition();
        while (shouldRun && false) {
            // unreachable code block
            System.out.println("This line should never be executed");
        }
        if (s == "one") return true; // BUG: UseEqualsToCompareStrings
        return false;
    }

    public boolean showBug(String s) {
        return checkString(s);
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}