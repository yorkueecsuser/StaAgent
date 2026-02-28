class VariableSelfAssignmentExample {

    private String name;
    private int count;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
    }

    public void setCount(int count) {
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

    // Mutant code: Renaming one of the variables
    private int b; // New variable with name in the form of [a-z]

    public void setB(int b) {
        this.b = b;
    }

    public void showMutant(int b) {
        setB(b);
        System.out.println("Mutated Count: " + this.b);
    }
}