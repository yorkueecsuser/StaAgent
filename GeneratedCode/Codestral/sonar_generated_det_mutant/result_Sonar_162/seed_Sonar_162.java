class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
        return this.name;
    }

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}