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

    // Mutant code with a renamed variable
    private String a;

    public void setA(String a) {
        this.a = a;
    }

    public void showBugMutant(String name, int count) {
        setA(name);
        setCount(count);
        System.out.println("Name: " + this.a); // Using the mutated name
        System.out.println("Count: " + this.count);
    }
}