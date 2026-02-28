class VariableSelfAssignmentExample {

    private String name;
    private int count;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to 'conditionFor' being false
            System.out.println("This is an unreachable for loop in setName");
        }
    }

    public void setCount(int count) {
        count = count; // BUG: Variables should not be self-assigned

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to 'conditionFor' being false
            System.out.println("This is an unreachable for loop in setCount");
        }
    }

    public void showBug(String name, int count) {
        setName(name);
        setCount(count);
        System.out.println("Name: " + this.name);
        System.out.println("Count: " + this.count);

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to 'conditionFor' being false
            System.out.println("This is an unreachable for loop in showBug");
        }
    }

    // Helper method to provide a dynamic condition evaluated at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);

        // Unreachable for loop
        VariableSelfAssignmentExample helperExample = new VariableSelfAssignmentExample();
        boolean conditionFor = helperExample.getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable due to 'conditionFor' being false
            System.out.println("This is an unreachable for loop in main");
        }
    }
}