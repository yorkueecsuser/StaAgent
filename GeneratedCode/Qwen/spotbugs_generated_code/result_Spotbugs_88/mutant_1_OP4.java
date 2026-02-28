class SelfAssignmentBug {

    private int value;

    public SelfAssignmentBug(int initialValue) {
        this.value = initialValue;
    }

    public int showBug() {
        value = value; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable
            value = value + 1;
        } else {
            // This block is unreachable because getCondition() always returns false
            value = value - 1;
        }

        return value;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the else block unreachable
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug(10);
        System.out.println("Value after self-assignment: " + bugDemo.showBug());
    }
}