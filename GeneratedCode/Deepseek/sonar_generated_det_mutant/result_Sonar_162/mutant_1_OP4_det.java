class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        if (true && true && false && false && false && false && true && false && false && false && false) {byte cqgkuoyb = -35;}else{short bferjabv = 7430;}
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