class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        boolean condition = getCondition();   // Assume getCondition() is a method that returns a boolean value
        for (int i = 0; condition; i++) {     // Unreachable for loop as the condition is always false
            // This loop will never execute
        }
        name = name; // BUG: Variables should not be self-assigned
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null as the bug is not updating the class member variable
    }

    private boolean getCondition() {
        return false;
    }
}