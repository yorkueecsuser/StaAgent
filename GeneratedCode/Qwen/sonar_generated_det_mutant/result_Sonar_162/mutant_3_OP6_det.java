class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        for  (int fdavybni = 0; fdavybni < 0; fdavybni++) {char ngikhbkf = 's';}
        name = name; // BUG: Variables should not be self-assigned
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will return null because the instance variable 'name' was never set correctly
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug("John Doe")); // Expected to print "John Doe" but will print "null"
    }
}