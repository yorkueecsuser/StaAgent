class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
    }
public void showBug() {
    String name = "John Doe";
    name = "John Doe";
    setName(name);
    System.out.println(name);
}

    public static void main(String[] args) {
        VariableSelfAssignment instance = new VariableSelfAssignment();
        instance.showBug();
    }
}