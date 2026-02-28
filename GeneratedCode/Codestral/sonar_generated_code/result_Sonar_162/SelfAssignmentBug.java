class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable code: This while loop is inserted as the mutation operator suggests,
            // but since the condition is always false, this code will never execute.
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null as the bug is not updating the class member variable
    }

    private boolean getUnreachableCondition() {
        // This method returns a false value to ensure the while loop is unreachable.
        return false;
    }
}