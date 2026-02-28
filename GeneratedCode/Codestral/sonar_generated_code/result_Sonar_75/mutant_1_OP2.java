class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        int result = numerator / denominator; // Noncompliant, possible division by zero
        int duplicateResult = numerator / denominator; // Mutant code, duplicates the division operation
        return result;
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}