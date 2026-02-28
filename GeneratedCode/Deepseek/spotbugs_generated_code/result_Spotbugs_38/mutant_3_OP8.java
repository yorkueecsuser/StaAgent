class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        return tostring();
    }

    // Mutant code
    public String anotherMethod() {
        int aVar = 10;
        // Renaming the variable aVar to zVar
        int zVar = aVar + 5;
        return "Mutated another method: " + zVar;
    }
}