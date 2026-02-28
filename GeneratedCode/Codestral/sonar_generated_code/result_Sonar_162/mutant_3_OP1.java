class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name; // Bug: Variables should not be self-assigned

        // Dead store mutant
        String unusedVariable = "abcdefgh";
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null as the bug is not updating the class member variable
    }
}