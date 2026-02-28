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

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
        }
    }

    // Helper method to provide a dynamic condition
    private static boolean getCondition() {
        return false;
    }
}