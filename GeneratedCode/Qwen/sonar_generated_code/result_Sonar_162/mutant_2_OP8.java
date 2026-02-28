class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        // Mutant: Renaming 'name' parameter to 'a'
        String a = name;
        this.name = a;
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null because the instance variable name was never set correctly
        // Mutant: Renaming 'name' variable to 'b'
        String b = name;
        return b;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug("John Doe")); // Expected to print "null" due to the bug
        // Mutant: Renaming 'bugDemo' variable to 'c'
        SelfAssignmentBug c = new SelfAssignmentBug();
        System.out.println(c.showBug("John Doe"));
    }
}