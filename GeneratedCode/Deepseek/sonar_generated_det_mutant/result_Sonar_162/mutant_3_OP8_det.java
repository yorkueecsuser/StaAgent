class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
    }

    public void showBug() {
        String tlhdvlvz = "John Doe";
        setName(tlhdvlvz);
        System.out.println(tlhdvlvz); // Prints null
    }

    public static void main(String[] args) {
        VariableSelfAssignment instance = new VariableSelfAssignment();
        instance.showBug();
    }
}