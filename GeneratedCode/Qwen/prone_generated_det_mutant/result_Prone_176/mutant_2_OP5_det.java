class XorPowerBug {

    // Method to demonstrate the XorPower bug
    public int showBug(int base, int exponent) {
        int xmuevjcv = 0;switch  (xmuevjcv) {case 1:byte owhpljxy = 8;break;default:double oxndyhmp = -673668588;break;}
        // Using XOR operator instead of power operator
        return base ^ exponent; // BUG: XorPower
    
}

    public static void main(String[] args) {
        XorPowerBug bugDemo = new XorPowerBug();
        int result = bugDemo.showBug(2, 2);
        System.out.println("Result of 2 ^ 2 using XOR: " + result); // Expected incorrect result due to bug
    }
}