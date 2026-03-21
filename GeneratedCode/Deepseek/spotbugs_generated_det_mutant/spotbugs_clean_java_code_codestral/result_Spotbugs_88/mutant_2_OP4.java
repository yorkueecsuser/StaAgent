class SelfAssignmentBug {
    private int x;
    private boolean getFalseCondition() { return false; }

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;

        // Mutation Operator: Unreachable if-else statement
        if(getFalseCondition()) {
            System.out.println("This statement is unreachable.");
        } else {
            // Empty block to avoid unreachable statement errors
        }

        return this.x;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}