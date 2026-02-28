class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        // Mutant: Renaming the parameter 'name' to 'a'
        String a = name;
        this.name = a;
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null because the instance variable name was never set correctly
        // Mutant: Renaming the local variable 'inputName' to 'b'
        String b = inputName;
        setName(b);
        return this.name;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug("John Doe")); // Expected to print "null" due to the bug
        // Mutant: Renaming the local variable 'bugDemo' to 'c'
        SelfAssignmentBug c = new SelfAssignmentBug();
        System.out.println(c.showBug("John Doe"));
    }
}