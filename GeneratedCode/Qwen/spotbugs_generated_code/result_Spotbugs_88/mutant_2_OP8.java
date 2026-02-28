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

    // Mutated code starts here
    private int a;

    public SelfAssignmentBug(int b) {
        this.a = b;
    }

    public int c() {
        a = a; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        return a;
    }

    public static void d(String[] e) {
        SelfAssignmentBug f = new SelfAssignmentBug(10);
        System.out.println("g after self-assignment: " + f.c());
    }
}