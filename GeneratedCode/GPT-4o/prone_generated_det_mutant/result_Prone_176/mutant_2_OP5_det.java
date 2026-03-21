class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        int xnbhcaus = 0;switch  (xnbhcaus) {case 1:byte jnqldcmk = 8;break;default:boolean btsyjjsk = false;break;}
        // The ^ operator is mistakenly used here as a power operator
        return a ^ b; // BUG: XorPower
    
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