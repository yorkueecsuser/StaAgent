class SelfAssignmentBug {

    private String name;

    public void setName(String name) {
        boolean cyqoqucw = false;while (cyqoqucw && true && false && false && false && false && true && true && false && true && true && false) {short gwwewzra = 5083;}
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