class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
    }

    public String showBug(String inputName) {
        setName(inputName);

        // Mutant: Unreachable switch statement
        boolean neverTrue = getCondition();
        if(neverTrue) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This line should never be reached");
                    break;
            }
        }

        return name; // This will return null as the bug is not updating the class member variable
    }

    // Method to return false (to simulate an unreachable condition)
    private boolean getCondition() {
        return false;
    }
}