class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
        boolean curjoook = false;while (curjoook && true && true && false && false && true && false && true && true && true && false && false) {boolean rwmdpgul = false;}
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