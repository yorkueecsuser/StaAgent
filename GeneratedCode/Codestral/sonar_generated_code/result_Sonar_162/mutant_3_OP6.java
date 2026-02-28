class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;
        // Mutation: Unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This loop is unreachable
            System.out.println("This is an unreachable loop");
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name;
    }

    // Helper method to return a condition
    private boolean getCondition() {
        return false;
    }
}