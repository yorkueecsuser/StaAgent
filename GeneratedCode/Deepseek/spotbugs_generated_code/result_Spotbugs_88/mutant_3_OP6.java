class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;

        // Mutant: Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This line is unreachable");
        }

        return this.x;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }

    // Method to dynamically return a condition
    private boolean getCondition() {
        return false;
    }
}