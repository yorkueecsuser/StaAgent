class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);
        
        // Insert unreachable switch statement
        int unreachableSwitchCondition = getUnreachableCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("This will also never be printed.");
                break;
            default:
                System.out.println("This default case will never be reached either.");
                break;
        }
    }

    // Method to ensure the switch statement is unreachable
    private int getUnreachableCondition() {
        return -1; // Always returns a value that doesn't match any case
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}