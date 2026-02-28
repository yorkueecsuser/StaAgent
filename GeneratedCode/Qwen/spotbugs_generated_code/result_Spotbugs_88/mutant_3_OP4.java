class SelfAssignmentBug {

    private int value;

    public SelfAssignmentBug(int initialValue) {
        this.value = initialValue;
    }

    public int showBug() {
        value = value; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)

        // Mutated code with unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            value = 20;
        } else {
            // This block will always execute
            value = 30;
        }

        return value;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug(10);
        System.out.println("Value after self-assignment: " + bugDemo.showBug());
    }
}