class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // Unreachable for loop mutant
            System.out.println("This is an unreachable loop");
        }
        return tostring();
    }
}