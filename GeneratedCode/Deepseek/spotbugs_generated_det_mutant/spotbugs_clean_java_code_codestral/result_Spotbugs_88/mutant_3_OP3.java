class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        boolean isTrue = false; // Non-final variable to avoid using a compile-time constant
        if (isTrue) {
            System.out.println("This statement should never be printed.");
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