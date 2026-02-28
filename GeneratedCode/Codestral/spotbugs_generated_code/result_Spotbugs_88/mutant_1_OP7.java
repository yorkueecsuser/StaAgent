class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;
        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop");
        }
        return this.x;
    }

    private boolean getCondition() {
        // This always returns false to make the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}