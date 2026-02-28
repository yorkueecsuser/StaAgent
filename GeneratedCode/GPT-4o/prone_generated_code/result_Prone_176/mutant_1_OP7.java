class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);

        // Introduce unreachable while loop
        boolean conditionWhile = getCondition(); // Non-final variable used
        while (conditionWhile) {
            System.out.println("This is an unreachable statement.");
        }
    }

    // Method that returns false ensuring the while loop is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}