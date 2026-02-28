class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        // Mutant: Renaming 'name' parameter to 'x'
        String x = name;
        this.name = x;
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null because the instance variable name was never set correctly
        // Mutant: Renaming 'inputName' parameter to 'y'
        String y = inputName;
        setName(y);
        return this.name;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug("John Doe")); // Expected to print "null" due to the bug
        // Mutant: Renaming 'bugDemo' variable to 'z'
        SelfAssignmentBug z = new SelfAssignmentBug();
        System.out.println(z.showBug("John Doe"));
    }
}