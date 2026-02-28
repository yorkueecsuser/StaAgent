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

        // Unreachable if statement
        boolean condition = getCondition(); // Dynamically determine condition
        if (condition) {
            System.out.println("This statement is unreachable.");
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to make the if statement's block unreachable
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}