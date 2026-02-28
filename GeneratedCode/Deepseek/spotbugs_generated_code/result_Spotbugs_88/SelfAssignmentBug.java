class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Adding a do-while loop for the Equivalent Loop Replacement mutation operator
        int i = 0;
        do {
            // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
            this.x = this.x;
            i++;
        } while(i < 1);
        return this.x;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}