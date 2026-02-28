class SelfAssignmentBug {
    private String name;
    private String renamedName;  // Added new variable for mutation

    public void setName(String name) {
        renamedName = name;  // Mutated line, using new variable instead of self-assignment
    }

    public String showBug(String inputName) {
        setName(inputName);
        return renamedName;  // Using the newly renamed variable
    }
}