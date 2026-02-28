class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        int d = denominator; // Mutant code: renaming denominator to d
        if (d == 0) { // Mutant code: using the renamed variable d
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        return numerator / d; // Noncompliant, possible division by zero
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an IllegalArgumentException
    }
}