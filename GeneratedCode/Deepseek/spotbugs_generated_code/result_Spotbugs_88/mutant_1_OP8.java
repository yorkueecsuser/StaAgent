class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        int z = this.x; // Mutation: Renamed 'y' to 'z'
        this.x = z; // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        return this.x;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}