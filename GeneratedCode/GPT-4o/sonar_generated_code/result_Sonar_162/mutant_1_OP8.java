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

    // Mutant code begins
    private String a;
    private int b;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void showMutant(String a, int b) {
        setA(a);
        setB(b);
        System.out.println("Renamed Name: " + this.a);
        System.out.println("Renamed Count: " + this.b);
    }
    // Mutant code ends

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);

        // Executing mutant code
        example.showMutant("Bob", 20);
    }
}