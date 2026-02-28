class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        boolean condition = false;
        if (condition) {
            return "Unreachable code";
        } else {
            return tostring();
        }
    }
}