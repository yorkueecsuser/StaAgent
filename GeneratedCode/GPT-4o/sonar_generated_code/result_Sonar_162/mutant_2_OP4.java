class VariableSelfAssignmentExample {

    private String name;
    private int count;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        
        // Unreachable if-else statement
        boolean isUnreachable = getCondition();
        if (isUnreachable) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is also unreachable.");
        }
    }

    public void setCount(int count) {
        count = count; // BUG: Variables should not be self-assigned
        
        // Unreachable if-else statement
        boolean isUnreachable = getCondition();
        if (isUnreachable) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is also unreachable.");
        }
    }

    public void showBug(String name, int count) {
        setName(name);
        setCount(count);
        System.out.println("Name: " + this.name);
        System.out.println("Count: " + this.count);
    }

    private boolean getCondition() {
        // This method always returns false to simulate unreachable code
        return false;
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}