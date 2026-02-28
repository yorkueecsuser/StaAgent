class BooleanAssignmentBug {

    // Method to demonstrate the bug
    public boolean showBug() {
        boolean result = false;
        if (result = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        System.out.println(bugDemo.showBug());

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case will never be reached because the condition is set to false
                System.out.println("This is unreachable code");
                break;
            default:
                // Default case to ensure switch is not empty
                break;
        }
    }

    // Method to provide a dynamic condition for the switch statement
    private static boolean getCondition() {
        return false;
    }
}