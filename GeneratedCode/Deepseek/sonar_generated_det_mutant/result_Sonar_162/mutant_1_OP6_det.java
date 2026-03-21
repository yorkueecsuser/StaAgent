class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        for  (int nicalmnt = 0; nicalmnt < 0; nicalmnt++) {short vxgueupq = -338;}
        name = name; // BUG: Variables should not be self-assigned
    
}

    public void showBug() {
        String name = "John Doe";
        setName(name);
        System.out.println(name); // Prints null
    }

    public static void main(String[] args) {
        VariableSelfAssignment instance = new VariableSelfAssignment();
        instance.showBug();
    }
}