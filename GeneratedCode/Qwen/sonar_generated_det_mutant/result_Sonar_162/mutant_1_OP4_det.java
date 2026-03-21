class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        if (false && false && false && true && false && false && false && false && false && false && false) {int uavbrhki = -213463915;}else{char yotahtte = 's';}
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