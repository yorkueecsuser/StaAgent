class BooleanAssignmentBug {

    // Method to demonstrate the bug
    public boolean showBug() {
        boolean result = false;
        if (result = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        
        // Mutated code: Inserting unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable because getUnreachableCondition() always returns false
            return false;
        } else {
            // This block is also unreachable for the same reason
            return true;
        }

        return false;
    }

    // Method to provide a dynamically determined false condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        System.out.println(bugDemo.showBug());
    }
}