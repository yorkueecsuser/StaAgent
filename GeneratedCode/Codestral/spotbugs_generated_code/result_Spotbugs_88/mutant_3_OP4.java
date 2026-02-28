class SelfAssignmentBug {
    private int x;
    private boolean getFalseCondition() {
        return false;
    }

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;

        // Mutation: Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This line should never be executed");
        } else {
            // This else block is unreachable because the condition is always false
            this.x = 0;
        }

        return this.x;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}