class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;
        return this.x;
    }

    // Mutation: Equivalent Loop Replacement
    public void equivalentLoopReplacement() {
        int i = 0;
        do {
            // Loop body remains the same
            this.x = this.x;
            i++;
        } while(i < 1);  // Equivalent condition for single iteration
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
        bug.equivalentLoopReplacement(); // Calling the mutated method
    }
}