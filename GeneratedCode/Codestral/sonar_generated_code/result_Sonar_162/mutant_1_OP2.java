class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        this.name = name; // BUG: Variables should not be self-assigned
        this.name = name; // Mutant: Duplicated assignment statement
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return the same value as inputName, but the mutant will duplicate the assignment
    }
}