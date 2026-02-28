class VariableSelfAssignmentExample {

    private String name;
    private int count;

    public void setName(String name) {
        name = name; // BUG: Variables should not be self-assigned
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code");
            conditionWhile = getUnreachableCondition(); // To prevent unreachable statement error
        }
    }

    public void setCount(int count) {
        count = count; // BUG: Variables should not be self-assigned
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code");
            conditionWhile = getUnreachableCondition(); // To prevent unreachable statement error
        }
    }

    public void showBug(String name, int count) {
        setName(name);
        setCount(count);
        System.out.println("Name: " + this.name);
        System.out.println("Count: " + this.count);
    }

    public static void main(String[] args) {
        VariableSelfAssignmentExample example = new VariableSelfAssignmentExample();
        example.showBug("Alice", 10);
    }
    
    private boolean getUnreachableCondition() {
        return false;
    }
}