class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
    }

    public void showBug() {
        String imuquock = "John Doe";
        setName(imuquock);
        System.out.println(imuquock); // Prints null
    }

    public static void main(String[] args) {
        VariableSelfAssignment instance = new VariableSelfAssignment();
        instance.showBug();
    }
}