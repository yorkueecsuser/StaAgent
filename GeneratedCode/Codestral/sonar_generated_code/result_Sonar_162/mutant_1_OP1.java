class SelfAssignmentBug {
    private String name;

    public void setName(String inputName) {
        String deadStore = "deadstore"; // dead store added by the mutation operator
        name = inputName; // BUG: Variables should not be self-assigned fixed
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name;
    }
}