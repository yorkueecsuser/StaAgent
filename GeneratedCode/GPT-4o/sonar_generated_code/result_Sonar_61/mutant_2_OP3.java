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
        // Inserting an unreachable if statement
        boolean alwaysFalse = computeFalseCondition();
        if (alwaysFalse) {
            System.out.println("This will never be printed.");
        }
        return getY();
    }

    // This method always returns false, making the if statement unreachable
    private boolean computeFalseCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
}