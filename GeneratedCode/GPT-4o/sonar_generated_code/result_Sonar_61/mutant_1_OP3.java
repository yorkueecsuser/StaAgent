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
        return getY();
    }
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);

        // Mutation: Unreachable if statement
        boolean condition = getCondition(); // Dynamic condition to avoid compile-time constant
        if (condition) {
            System.out.println("This code is unreachable because condition is always false.");
        }
    }
    
    // Helper method to simulate a condition that is always false
    private static boolean getCondition() {
        return false;
    }
}