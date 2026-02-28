class VariableSelfAssignmentExample {

    private String name;
    private int count;

    public void setName(String name) {
        boolean conditionWhile = getCondition(); // Condition to make while loop unreachable
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("Unreachable while loop in setName");
        }
        name = name; // BUG: Variables should not be self-assigned
    }

    public void setCount(int count) {
        boolean conditionWhile = getCondition(); // Condition to make while loop unreachable
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("Unreachable while loop in setCount");
        }
        count = count; // BUG: Variables should not be self-assigned
    }

    public void showBug(String name, int count) {
        boolean conditionWhile = getCondition(); // Condition to make while loop unreachable
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("Unreachable while loop in showBug");
        }
        setName(name);
        setCount(count);
        System.out.println("Name: " + this.name);
        System.out.println("Count: " + this.count);
    }

    // Method to provide a false condition, making the while loops unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}