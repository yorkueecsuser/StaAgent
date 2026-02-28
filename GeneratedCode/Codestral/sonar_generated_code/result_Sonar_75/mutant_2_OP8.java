class ZeroDenominator {
    public int showBug(int n, int d) {
        // BUG: Zero should not be a possible denominator
        return n / d; // Noncompliant, possible division by zero
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException

        // Mutant code
        int x = 10;
        int y = 0;
        int r = demo.showBug(x, y); // This will also throw an ArithmeticException due to the mutant
        System.out.println("Mutant: " + r);
    }
}