class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);

        // Introduce an unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("Unreachable code block");
        } else {
            System.out.println("This is the reachable code block");
        }
    }

    // Method to always return false ensuring the branch is unreachable
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}