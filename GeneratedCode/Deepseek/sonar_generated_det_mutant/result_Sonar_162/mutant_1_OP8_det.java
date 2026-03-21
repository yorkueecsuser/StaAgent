class VariableSelfAssignment {

    private String name;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
    }

    public void showBug() {
        String ysdklhku = "John Doe";
        setName(ysdklhku);
        System.out.println(ysdklhku); // Prints null
    }

    public static void main(String[] args) {
        VariableSelfAssignment instance = new VariableSelfAssignment();
        instance.showBug();
    }
}