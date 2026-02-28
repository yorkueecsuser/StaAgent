class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not run
            System.out.println("This should never be printed");
        } else {
            // Alternative code that should also not run
            System.out.println("This should also never be printed");
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null because the instance variable name was never set correctly
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug("John Doe")); // Expected to print "null" due to the bug
        boolean shouldRunMain = getCondition();
        if (shouldRunMain) {
            // Some code that should not run
            System.out.println("This should never be printed in main");
        } else {
            // Alternative code that should also not run
            System.out.println("This should also never be printed in main");
        }
    }

    private static boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }
}