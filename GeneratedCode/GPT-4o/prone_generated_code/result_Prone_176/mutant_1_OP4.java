class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);

        // Inserting an unreachable if-else branch
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the reachable else block.");
        }
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}