class BuggyToString {
    public String tostring() { // Original bug: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    }

    public String showBug() {
        String s = tostring();
        String duplicate_s = s; // Duplication: duplicate the assignment statement
        return duplicate_s;
    }
}