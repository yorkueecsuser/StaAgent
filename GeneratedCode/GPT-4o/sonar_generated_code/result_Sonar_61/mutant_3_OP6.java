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
        // Unreachable for loop added to the showBug method
        boolean conditionFor = getCondition(); // Using a method call to ensure it's not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never execute.");
        }
        
        setX(val);
        return getY();
    }

    // Method to ensure the condition is not a compile-time constant
    public boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
}