class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This while loop is unreachable as the condition is always false
            System.out.println("This is an unreachable while loop inserted by the mutation operator.");
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name;
    }
}