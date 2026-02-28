class BuggyToString {
    public String tostring() { // Original bug
        return "Buggy toString method";
    }

    public String showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block is unreachable
            throw new RuntimeException("Unreachable code executed");
        }
        return tostring();
    }
}