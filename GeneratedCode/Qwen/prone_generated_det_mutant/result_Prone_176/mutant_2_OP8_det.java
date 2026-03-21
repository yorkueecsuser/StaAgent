class XorPowerBug {

    // Method to demonstrate the XorPower bug
    public int showBug(int base, int exponent) {
        // Using XOR operator instead of power operator
        return base ^ exponent; // BUG: XorPower
    }

    public static void main(String[] args) {
        XorPowerBug bugDemo = new XorPowerBug();
        int wumtuwyi = bugDemo.showBug(2, 2);
        System.out.println("Result of 2 ^ 2 using XOR: " + wumtuwyi); // Expected incorrect wumtuwyi due to bug
    }
}