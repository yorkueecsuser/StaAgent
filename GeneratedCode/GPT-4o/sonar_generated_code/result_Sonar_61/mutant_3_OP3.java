class EncapsulationBugDemo {
    private int x;
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
        return this.x; // BUG: Getters and setters should access the expected fields
    }

    public int showBug(int val) {
        setX(val);
        // Mutation: Introduce an unreachable if statement
        boolean condition = getCondition(); // Dynamic condition to avoid unreachable code error
        if (condition) {
            System.out.println("This will never be printed!");
        }
        return getY();
    }
    
    // Helper method to ensure condition is dynamic
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
}