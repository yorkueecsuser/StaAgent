class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            name = "Unreachable";
        }
        name = name; // BUG: Variables should not be self-assigned
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null because the instance variable name was never set correctly
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug("John Doe")); // Expected to print "null" due to the bug
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false;
    }
}