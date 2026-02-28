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

        // Inserting unreachable switch statement
        int condition = getUnreachableCondition();
        switch (condition) {
            case 1:
                System.out.println("This case is unreachable");
                break;
        }
    }

    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the switch case unreachable
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
}