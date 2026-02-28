class BooleanAssignmentBug {

    // Method to demonstrate the bug
    public boolean showBug() {
        boolean result = false;
        if (result = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        // Mutated code: Inserting an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed because condition is always false
            result = false;
        } else {
            // This block will always be executed
            result = true;
        }
        return false;
    }

    // Method to provide a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        System.out.println(bugDemo.showBug());
    }
}