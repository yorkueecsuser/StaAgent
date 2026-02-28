class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        String buggyString = tostring();
        String duplicatedString = tostring(); // Mutant: Duplication of the assignment statement
        return buggyString;
    }
}