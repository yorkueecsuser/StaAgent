class ZeroDenominator {
    public int showBug(int num, int den) {
        // BUG: Zero should not be a possible denominator
        return num / den; // Noncompliant, possible division by zero
    }

    // Mutant code added here
    public int showMutant(int a, int b) {
        return a / b; // Renaming variables num to a and denominator to b
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
        System.out.println(demo.showMutant(1, 0)); // This will also throw an ArithmeticException
    }
}