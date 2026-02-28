class SelfAssignmentBug {
    private int x;
    private int y; // New variable for mutation

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;
        return this.x;
    }

    public void setY(int value) { // New method for mutation
        this.y = value;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        bug.setY(20); // New line for mutation
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}