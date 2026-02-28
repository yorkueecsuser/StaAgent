class BooleanAssignmentBug {

    // Method to demonstrate the bug
    public boolean showBug() {
        boolean result = false;
        if (result = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        return false;
    }

    // Inserting an unreachable if branch
    public boolean showBugWithUnreachable() {
        boolean result = false;
        if (result = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        // Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable statement");
        }
        return false;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        System.out.println(bugDemo.showBug());
        System.out.println(bugDemo.showBugWithUnreachable());
    }
}