class BuggyToString {
    public String tostring() { // BUG: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    }

    public String showBug() {
        int i = 0;
        do {
            i++;
        } while (i < 1); // Equivalent Loop Replacement: A do-while loop is added here.
        return tostring();
    }
}