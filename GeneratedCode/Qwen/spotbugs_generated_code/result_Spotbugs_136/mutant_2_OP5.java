class BooleanAssignmentBug {

    // Method to demonstrate the bug
    public boolean showBug() {
        boolean result = false;
        if (result = true) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT) 
            return true;
        }
        return false;
    }

    // Added mutant code with an unreachable switch statement
    public void unreachableSwitch() {
        boolean condition = false; // This will always be false
        switch (condition) {
            case true:
                System.out.println("This is unreachable");
                break;
            default:
                System.out.println("This is also unreachable");
                break;
        }
    }

    public static void main(String[] args) {
        BooleanAssignmentBug bugDemo = new BooleanAssignmentBug();
        System.out.println(bugDemo.showBug());
        bugDemo.unreachableSwitch(); // Call to the new method with unreachable switch
    }
}