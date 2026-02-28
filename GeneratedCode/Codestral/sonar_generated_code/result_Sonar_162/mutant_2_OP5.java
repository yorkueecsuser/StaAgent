class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) { // Unreachable switch statement
            case 1:
                System.out.println("This code should never be reached");
                break;
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null as the bug is not updating the class member variable
    }
}