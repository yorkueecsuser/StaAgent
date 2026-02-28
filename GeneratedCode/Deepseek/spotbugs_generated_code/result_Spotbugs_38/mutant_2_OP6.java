class BuggyToString {
    public String tostring() {
        return "Buggy toString method";
    }

    public String showBug() {
        // Mutation: Inserting unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("Unreachable code");
        }
        return tostring();
    }

    private boolean getFalseCondition() {
        return false;
    }
}