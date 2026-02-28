class BuggyToString {
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    }

    public String showBug() {
        if (getUnreachableCondition()) { // Mutation: Unreachable if statement
            return "Unreachable code";
        } else {
            return tostring();
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always false to make it unreachable
    }
}