class AssertJBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else branch
            return "Unreachable branch";
        } else {
            return actual.equals(expected)? "No error" : "Description";
        }
    }
}