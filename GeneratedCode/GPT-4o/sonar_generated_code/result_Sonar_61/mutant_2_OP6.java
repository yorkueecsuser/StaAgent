class EncapsulationBugDemo {
    private int x;
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
        
        boolean conditionFor = getLoopCondition(); // Condition for the unreachable loop
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed
            System.out.println("Unreachable for loop iteration: " + i);
        }
    }

    public int getY() {
        return this.x; // BUG: Getters and setters should access the expected fields
        
        boolean conditionFor = getLoopCondition(); // Condition for the unreachable loop
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed
            System.out.println("Unreachable for loop iteration: " + i);
        }
    }

    public int showBug(int val) {
        setX(val);
        return getY();
    }

    private boolean getLoopCondition() {
        return false; // Ensures the for loop condition is false at runtime
    }
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
}