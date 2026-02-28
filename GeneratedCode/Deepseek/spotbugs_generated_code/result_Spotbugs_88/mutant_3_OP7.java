class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;

        // Mutant: Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code is unreachable");
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