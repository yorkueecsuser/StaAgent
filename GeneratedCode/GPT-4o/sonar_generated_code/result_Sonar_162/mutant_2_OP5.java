class VariableSelfAssignmentExample {

    private String name;
    private int count;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned

        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be reached
                System.out.println("This is unreachable code in setName");
                break;
        }
    }

    public void setCount(int count) {
        count = count; // BUG: Variables should not be self-assigned

        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 888: // This case will never be reached
                System.out.println("This is unreachable code in setCount");
                break;
        }
    }

    public void showBug(String name, int count) {
        setName(name);
        setCount(count);
        System.out.println("Name: " + this.name);
        System.out.println("Count: " + this.count);
    }

    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return -1; // Always returns a value that does not match any case
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}