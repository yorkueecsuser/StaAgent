class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);

        // Insert an unreachable switch statement
        int unreachableSwitchValue = calculateUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                System.out.println("Default case for unreachable switch.");
                break;
        }
    }

    // Helper method to ensure the switch statement is unreachable
    private int calculateUnreachableSwitchValue() {
        return 0; // Always returns 0, making the switch cases unreachable
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}