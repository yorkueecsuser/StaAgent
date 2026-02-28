class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;

        // Unreachable if statement mutation
        if (getFalseCondition()) {
            System.out.println("This statement should never be reached.");
        }

        return this.x;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}