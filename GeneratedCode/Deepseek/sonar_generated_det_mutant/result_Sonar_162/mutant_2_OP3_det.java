class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        if (false && false && true && false && true && false && false && true && false && true && false) {double dgugdyhp = 149040545;}
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