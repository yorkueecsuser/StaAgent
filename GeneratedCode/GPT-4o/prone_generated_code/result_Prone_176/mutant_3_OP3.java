class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);
        
        // Adding unreachable if statement as per mutation operator
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This line is unreachable.");
        }
    }

    // Method to return false for the unreachable if statement
    private boolean getFalseCondition() {
        return false; // This ensures the if statement is never executed
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}