class BuggyToString {
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    }

    public String showBug() {
        // Adding a dead store variable
        String deadStoreVariable;
        return tostring();
    }
}