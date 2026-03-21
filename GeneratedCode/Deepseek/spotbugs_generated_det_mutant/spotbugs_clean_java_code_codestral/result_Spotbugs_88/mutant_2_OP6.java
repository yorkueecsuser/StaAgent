class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;
        // Mutation: Unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("Unreachable code");
        }
        return this.x;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}