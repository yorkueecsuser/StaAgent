class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        this.name = name; // Original code, fixing the self-assignment bug
        this.name = name; // Mutant code: Duplication of the assignment statement
    }

    public String showBug(String inputName) {
        setName(inputName);
        return this.name; // This will return the inputName as the mutant code is not causing any side effect
    }
}