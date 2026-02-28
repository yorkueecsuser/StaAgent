class BuggyToString {
    public String tostring() { // Original bug: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    }

    public String showBug() {
        String renamedVariable = tostring(); // Mutant: Renamed variable 'tostring' to'renamedVariable'
        return renamedVariable;
    }
}