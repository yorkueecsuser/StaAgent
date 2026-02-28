class BuggyToString {
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        int unusedVariable; // Added by Dead Store mutation operator
        return "Buggy toString method";
    }

    public String showBug() {
        return tostring();
    }
}