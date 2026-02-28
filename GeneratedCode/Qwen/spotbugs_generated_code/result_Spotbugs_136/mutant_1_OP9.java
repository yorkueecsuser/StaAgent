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

        // Equivalent Loop Replacement (though there are no loops, adding a unique do-while loop that does nothing)
        int i = 0;
        do {
            // This loop does nothing and is just for demonstration of Equivalent Loop Replacement
            i++;
        } while (i < 0); // This condition will never be true, so the loop will not execute
    }
}