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
        boolean condition = getCondition(); // Using a method to ensure runtime determination
        if (condition) {
            // This block will never execute because condition will always be false
            System.out.println("This is an unreachable if statement.");
        } else {
            // This is the reachable part of the code
            System.out.println("Proceeding with the regular flow.");
        }
        return getY();
    }
    
    // Method to simulate a runtime condition that always returns false
    private boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
}