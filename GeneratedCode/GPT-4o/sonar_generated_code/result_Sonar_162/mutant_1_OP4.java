class VariableSelfAssignmentExample {

    private String name;
    private int count;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        
        // Adding an unreachable if-else statement
        boolean condition = getFalseCondition(); // This method always returns false
        if (condition) {
            this.name = "Unreachable Code";
        } else {
            // Normal execution continues here
        }
    }

    public void setCount(int count) {
        count = count; // BUG: Variables should not be self-assigned
        
        // Adding an unreachable if-else statement
        boolean condition = getFalseCondition(); // This method always returns false
        if (condition) {
            this.count = -1;
        } else {
            // Normal execution continues here
        }
    }

    public void showBug(String name, int count) {
        setName(name);
        setCount(count);
        System.out.println("Name: " + this.name);
        System.out.println("Count: " + this.count);
    }

    // A method that returns false to simulate an unreachable condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}