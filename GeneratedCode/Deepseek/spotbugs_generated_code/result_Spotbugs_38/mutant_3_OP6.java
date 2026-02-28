class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Added unreachable for loop
            System.out.println("This is an unreachable loop");
        }
        return tostring();
    }
}