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
        
        // Adding unreachable if-else statement
        boolean condition = getCondition(); // dynamically determined at runtime
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This is the else branch, which will always execute.");
        }

        return getY();
    }
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
    
    // Method to determine the condition dynamically
    private boolean getCondition() {
        return false; // Always returns false
    }
}