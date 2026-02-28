class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        boolean conditionWhile = false; // unreachable condition
        while (conditionWhile) { // unreachable while loop
            System.out.println("Unreachable code");
        }
        return tostring();
    }
}