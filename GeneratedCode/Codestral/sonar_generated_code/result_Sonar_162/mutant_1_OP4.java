class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable, it will never be executed
            System.out.println("Unreachable code executed!");
        } else {
            // This is the original code path
            this.name = name;
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will correctly return the updated name
    }
}