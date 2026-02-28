class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        boolean shouldRun = getCondition(); // added for mutation
        if (shouldRun) { // added unreachable if-else branch for mutation
            System.out.println("This line will never execute.");
        } else {
            return tostring();
        }
    }

    // added method for dynamically determining the condition
    private boolean getCondition() {
        return false;
    }
}