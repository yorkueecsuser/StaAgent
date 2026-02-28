class BuggyToString {
    public String toString() { // Mutant: Changed to toString() to maintain the original bug
        return "Buggy toString method";
    }

    public String showBug() {
        return toString(); // Calling the mutant toString() method
    }
}