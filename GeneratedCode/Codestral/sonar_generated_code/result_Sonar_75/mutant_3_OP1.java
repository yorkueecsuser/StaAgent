class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        int deadStoreVariable; // Inserting a dead store variable
        // BUG: Zero should not be a possible denominator
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}