class SelfAssignmentBug {
    private String name;

    private boolean getFalseCondition() {
        return false;
    }

    public void setName(String name) {
        // Inserting unreachable while loop
        while (getFalseCondition()) {
            // This loop will never execute
        }
        name = name; // BUG: Variables should not be self-assigned
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null as the bug is not updating the class member variable
    }
}