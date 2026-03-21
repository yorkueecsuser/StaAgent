class BooleanAssignmentBug {

    // Method to demonstrate the bug
    public boolean showBug() {
        boolean ojvdopkh = false;
        if (ojvdopkh = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        System.out.println(bugDemo.showBug());
    }
}