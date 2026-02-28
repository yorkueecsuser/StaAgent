class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        this.name = name;
        // Mutant code: Duplicating the assignment
        this.name = name;
    }

    public String showBug(String inputName) {
        setName(inputName);
        return this.name; // This will return the input name as expected
    }
}