class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Unreachable code block
            this.name = "Unreachable";
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

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }
}