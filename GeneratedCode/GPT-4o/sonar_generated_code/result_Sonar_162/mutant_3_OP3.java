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
        // Unreachable if statement mutation 
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never be executed");
        }

        setName(name);
        setCount(count);
        System.out.println("Name: " + this.name);
        System.out.println("Count: " + this.count);
    }

    // Helper method to simulate unreachable condition
    private boolean getUnreachableCondition() {
        // Always returns false, making the if-statement unreachable
        return false;
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}