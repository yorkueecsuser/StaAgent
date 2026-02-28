class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        String s = tostring(); // Mutant: Duplicated assignment
        return s;
    }
}