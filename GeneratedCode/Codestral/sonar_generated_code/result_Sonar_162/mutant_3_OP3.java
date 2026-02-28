class SelfAssignmentBug {
    private String name;

    private boolean getCondition() {
        // This method is used to avoid using compile-time constants like false directly
        return false;
    }

    public void setName(String name) {
        if (getCondition()) {
            // Unreachable if statement
            System.out.println("This is an unreachable if statement");
        }
        name = name; // BUG: Variables should not be self-assigned
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null as the bug is not updating the class member variable
    }
}