class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        if (shouldRunUnreachableCode()) { // Unreachable if-else statement
            return 0; // This branch is unreachable
        } else {
            return numerator / denominator; // Noncompliant, possible division by zero
        }
    }

    public boolean shouldRunUnreachableCode() {
        return false;
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}