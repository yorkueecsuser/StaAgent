class SelfAssignmentBug {
    private int x;

    public void setX(int value) {
        this.x = value;
    }

    public int showBug() {
        // Bug: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        this.x = this.x;

        // Mutation Operator: Unreachable switch statement
        boolean shouldRun = getCondition();
        if(shouldRun) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This line should not be executed");
                    break;
            }
        }

        return this.x;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bug = new SelfAssignmentBug();
        bug.setX(10);
        System.out.println("Value of x after self assignment: " + bug.showBug());
    }
}