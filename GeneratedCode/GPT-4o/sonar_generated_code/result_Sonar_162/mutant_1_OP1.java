class VariableSelfAssignmentExample {

    private String name;
    private int count;

    public void setName(String name) {
        String abcdwxyz = "dead"; // Dead store: unused variable
        name = name; // BUG: Variables should not be self-assigned
    }

    public void setCount(int count) {
        int qwertyui = 42; // Dead store: unused variable
        count = count; // BUG: Variables should not be self-assigned
    }

    public void showBug(String name, int count) {
        setName(name);
        setCount(count);
        System.out.println("Name: " + this.name);
        System.out.println("Count: " + this.count);
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}