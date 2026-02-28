class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        return tostring();
    }

    // Mutant code based on Renaming operator
    public String anotherMethod() {
        int xyz = 10; // Renamed variable from 'x' to 'xyz'
        return Integer.toString(xyz);
    }
}