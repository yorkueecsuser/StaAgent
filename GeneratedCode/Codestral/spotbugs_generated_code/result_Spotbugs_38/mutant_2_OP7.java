class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This is an unreachable loop");
        }
        return tostring();
    }
}