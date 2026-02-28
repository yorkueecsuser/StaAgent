class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;

        // Mutation: Unreachable if-else statement
        boolean isFalse = false;
        if (isFalse) {
            System.out.println("This line should never be executed");
        } else {
            // This else block is unreachable because isFalse is always false
            int y = 10; // Added a statement to avoid empty block error
        }

        return this.x;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}