class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    }

    public void showBug() {
        int xwjdfmvy = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + xwjdfmvy);
    }

    public static void main(String[] args) {
        XorPowerExample example = new XorPowerExample();
        example.showBug();
    }
}