class BooleanAssignmentBug {

    // Method to demonstrate the bug
    public boolean showBug() {
        boolean result = false;
        if (result = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        return false;
    }

    // Inserting unreachable for loop
    public static void main(String[] args) {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        System.out.println(bugDemo.showBug());

        // Unreachable for loop
        boolean conditionFor = false; // This variable ensures the loop is unreachable
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
    }
}