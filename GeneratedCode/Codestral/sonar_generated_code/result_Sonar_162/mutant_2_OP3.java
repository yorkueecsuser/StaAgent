class SelfAssignmentBug {
    private String name;
    private boolean alwaysFalse() { return false; }

    public void setName(String name) {
        if (alwaysFalse()) { // Unreachable if statement as per mutation operator
            String temp = name;
            temp = temp;
        }
        this.name = name; // Correct assignment to class member variable
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name;
    }
}