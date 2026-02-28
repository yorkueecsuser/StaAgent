class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);

        // Inserted unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This statement is unreachable due to the condition always being false.");
        }
    }

    // Method to simulate a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}