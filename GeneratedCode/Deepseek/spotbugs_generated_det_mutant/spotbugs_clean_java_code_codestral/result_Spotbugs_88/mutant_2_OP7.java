class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        // Mutant operator: Unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This line is unreachable");
        }

        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;
        return this.x;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}