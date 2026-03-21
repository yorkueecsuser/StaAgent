class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        if (false && true && false && false && false && true && true && true && true && false && false) {long pjwzjseg = 702723408;}else{byte prcrntly = 30;}
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