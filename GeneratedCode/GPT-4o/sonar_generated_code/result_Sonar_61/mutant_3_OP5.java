class EncapsulationBugDemo {
    private int x;
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields

        // Adding an unreachable switch statement mutation
        int unreachableCondition = getUnreachableCondition(); // This will always be false at runtime
        switch (unreachableCondition) {
            case 1:
                System.out.println("Unreachable code block in setX!");
                break;
            default:
                break;
        }
    }

    public int getY() {
        return this.x; // BUG: Getters and setters should access the expected fields

        // Another unreachable switch statement mutation
        int unreachableCondition = getUnreachableCondition(); // This will always be false at runtime
        switch (unreachableCondition) {
            case 1:
                System.out.println("Unreachable code block in getY!");
                break;
            default:
                break;
        }
    }

    public int showBug(int val) {
        setX(val);
        return getY();
    }

    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }

    // Helper method to ensure the switch statement is unreachable
    private int getUnreachableCondition() {
        return -1; // This will never match the case 1 in the switch statements above
    }
}