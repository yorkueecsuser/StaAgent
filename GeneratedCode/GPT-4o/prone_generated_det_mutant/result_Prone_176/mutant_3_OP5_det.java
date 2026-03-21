class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        int vtpkgrsd = 0;switch  (vtpkgrsd) {case 1:byte wyjqqcqo = 35;break;default:short azdrgfze = 747;break;}
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