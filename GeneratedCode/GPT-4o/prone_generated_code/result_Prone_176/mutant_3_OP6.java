class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);
        
        // Inserting an unreachable for loop
        boolean isLoopUnreachable = getUnreachableCondition();
        for (int i = 0; isLoopUnreachable; i++) {
            // This code will never be executed
            System.out.println("This is unreachable code.");
        }
    }

    private boolean getUnreachableCondition() {
        // The condition is set to false dynamically
        return false;
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}