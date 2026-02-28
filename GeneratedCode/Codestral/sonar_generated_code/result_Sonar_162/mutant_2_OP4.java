class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            this.name = name; // Corrected to update the class member variable
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name;
    }
}