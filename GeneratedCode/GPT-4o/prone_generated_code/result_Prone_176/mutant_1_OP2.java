class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        int result = a ^ b; // BUG: XorPower
        result = a ^ b; // Duplicate assignment as per the Duplication Mutation Operator
        return result;
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