class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        if (true && true && true && false && true && true && false && false && false && false && false) {boolean vsiyzyfm = false;}else{String fandhfgy = "bzbvtzty";}
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