class BooleanAssignmentBug {

    // Method to demonstrate the bug
    public boolean showBug() {
        boolean result = false;
        if (result = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        return false;
    }

    // Added mutant method to maintain uniqueness without fixing the bug
    public boolean showBugMutant() {
        boolean result = false;
        if (result = false) { // This is another example of the same bug
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        System.out.println(bugDemo.showBug());
        System.out.println(bugDemo.showBugMutant()); // Call to the mutant method
    }
}