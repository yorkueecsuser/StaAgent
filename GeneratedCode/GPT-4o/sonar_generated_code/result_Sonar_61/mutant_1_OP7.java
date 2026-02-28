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
        boolean conditionWhile = getCondition(); // Dynamically determined condition
        while (conditionWhile) {
            // This block is unreachable due to the false condition
            System.out.println("This is an unreachable while loop.");
            conditionWhile = getCondition(); // Re-check the condition to avoid compile-time error
        }
        
        setX(val);
        return getY();
    }
    
    // Method to simulate a condition for the unreachable while loop
    private boolean getCondition() {
        return false; // Always returns false, making the loop unreachable
    }
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
}