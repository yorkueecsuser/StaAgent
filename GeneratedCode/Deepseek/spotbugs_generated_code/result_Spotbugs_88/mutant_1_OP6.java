class SelfAssignmentBug {
    private int x;

    private boolean getCondition() {
        // A simple method to always return false, simulating an unreachable condition
        return false;
    }

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;

        // Mutant: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This loop is unreachable.");
        }

        return this.x;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}