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
    }

    // Mutated code with renaming operator
    public boolean mutatedShowBug() {
        boolean x = false; // Renamed'result' to 'x'
        if (x = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        return false;
    }

    public static void mutatedMain(String[] args) {
        BooleanAssignmentBug y = new BooleanAssignmentBug(); // Renamed 'bugDemo' to 'y'
        System.out.println(y.mutatedShowBug());
    }
}