class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        boolean qxdvpfjs = false;while (qxdvpfjs && false && true && false && true && false && true && true && true && false && true && false) {short qguvpugn = 3283;}
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