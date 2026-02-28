class VariableSelfAssignmentExample {

    private String name;
    private int count;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
    }

    public void setCount(int count) {
        count = count; // BUG: Variables should not be self-assigned
    }

    public void showBug(String name, int count) {
        setName(name);
        setCount(count);
        System.out.println("Name: " + this.name);
        System.out.println("Count: " + this.count);

        // Inserting an unreachable if statement using a non-final variable
        boolean condition = getAlwaysFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable branch.");
        }
    }

    // This method returns a false condition to simulate an unreachable if statement
    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}