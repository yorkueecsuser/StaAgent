class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                this.name = "Unreachable Case";
                break;
            default:
                // Default case to ensure switch is not empty
                break;
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null because the instance variable name was never set correctly
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug("John Doe")); // Expected to print "null" due to the bug
    }

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, making the switch condition effectively false
    }
}