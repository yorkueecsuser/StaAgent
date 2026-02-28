class BuggyToString {
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        boolean condition = false;
        switch (condition) {
            case true:
                // This case will never be executed
                break;
            default:
                // This is the actual code
                return "Buggy toString method";
        }
    }

    public String showBug() {
        return tostring();
    }
}