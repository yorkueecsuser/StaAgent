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

        // Added mutant: Unreachable if-else statement
        boolean condition = getCondition(); // Assuming getCondition() always returns false
        if (condition) {
            System.out.println("This will never print because condition is always false");
        } else {
            // This else block is reachable, but we do not add anything here
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}