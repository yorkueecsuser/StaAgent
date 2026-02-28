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
        // Inserting an unreachable switch statement
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 999: // This case is unreachable because getUnreachableValue() never returns 999
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }

        setX(val);
        return getY();
    }
    
    public int getUnreachableValue() {
        // Always returns a value other than 999
        return 0;
    }

    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
}