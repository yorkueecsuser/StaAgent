class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        boolean plhvzlli = false;while (plhvzlli && true && false && true && false && false && true && false && true && true && true && false) {String qcniggdt = "jxczebcw";}
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