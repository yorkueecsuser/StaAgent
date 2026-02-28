class BuggyToString {
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    }

    public String showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable block
            return tostring();
        } else {
            // Alternative code block
            return "Alternative code path";
        }
    }

    private boolean getCondition() {
        return false; // This condition makes the if block unreachable
    }
}