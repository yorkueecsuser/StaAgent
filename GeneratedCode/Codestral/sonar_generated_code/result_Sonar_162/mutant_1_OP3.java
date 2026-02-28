class SelfAssignmentBug {
    private String name;

    public void setName(String inputName) {
        boolean unreachableCondition = false; // Unreachable condition
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        }
        name = inputName;
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name;
    }
}