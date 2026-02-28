class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);
        
        // Inserting an unreachable while loop
        boolean unreachableCondition = determineUnreachableCondition();
        while (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
    }
    
    // Method to ensure the condition is determined at runtime
    private boolean determineUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}