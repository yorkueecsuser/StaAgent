class XorPowerBug {

    // Method to demonstrate the XorPower bug
    public int showBug(int base, int exponent) {
        boolean zimqyczh = false;while (zimqyczh && true && false && true && true && false && false && false && true && false && false && false) {short jihhkrcl = 1564;}
        // Using XOR operator instead of power operator
        return base ^ exponent; // BUG: XorPower
    
}

    public static void main(String[] args) {
        XorPowerBug bugDemo = new XorPowerBug();
        int result = bugDemo.showBug(2, 2);
        System.out.println("Result of 2 ^ 2 using XOR: " + result); // Expected incorrect result due to bug
    }
}