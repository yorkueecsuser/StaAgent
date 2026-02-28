class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower

        // Insert an unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("Nor will this");
        }
    }

    // Method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}