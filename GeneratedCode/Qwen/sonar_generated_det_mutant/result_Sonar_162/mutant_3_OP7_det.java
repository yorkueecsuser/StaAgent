class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        boolean biyxvbco = false;while (biyxvbco && false && true && true && true && false && false && false && false && false && false && false) {double awbqkgog = 964144408;}
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