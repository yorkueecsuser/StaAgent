class XorPowerExample {

    public int demonstrateXorPowerBug(int a, int b) {
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

// Mutated code with the Renaming operator applied
class XorPowerExampleMutant {

    public int demonstrateXorPowerBug(int x, int y) { // 'a' renamed to 'x', 'b' renamed to 'y'
        // The ^ operator is mistakenly used here as a power operator
        return x ^ y; // BUG: XorPower
    }

    public void showBug() {
        int result = demonstrateXorPowerBug(2, 2);
        System.out.println("Result of 2 ^ 2 is: " + result);
    }

    public static void main(String[] args) {
        XorPowerExampleMutant example = new XorPowerExampleMutant();
        example.showBug();
    }
}