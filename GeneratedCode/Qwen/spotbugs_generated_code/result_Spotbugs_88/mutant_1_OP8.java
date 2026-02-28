class SelfAssignmentBug {

    private int value;

    public SelfAssignmentBug(int initialValue) {
        this.value = initialValue;
    }

    public int showBug() {
        value = value; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        return value;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug(10);
        System.out.println("Value after self-assignment: " + bugDemo.showBug());
    }

    // Mutated code
    private int z;

    public SelfAssignmentBug(int q) {
        this.z = q;
    }

    public int display() {
        z = z; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        return z;
    }

    public static void test(String[] w) {
        SelfAssignmentBug demo = new SelfAssignmentBug(20);
        System.out.println("Mutated value after self-assignment: " + demo.display());
    }
}