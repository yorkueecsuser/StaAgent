class SelfAssignmentBug {

    private int value;

    public SelfAssignmentBug(int initialValue) {
        this.value = initialValue;
    }

    public int showBug() {
        value = value; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            value = 42; // This line is unreachable due to the condition always being false
        }

        return value;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug(10);
        System.out.println("Value after self-assignment: " + bugDemo.showBug());
    }
}