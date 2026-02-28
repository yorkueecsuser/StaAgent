class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned

        // Mutation: unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code will never be executed!");
        } else {
            name = "Mutant";
        }
    }

    private boolean getCondition() {
        // This method always returns false to ensure the if-else branch is unreachable
        return false;
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null as the bug is not updating the class member variable
    }
}