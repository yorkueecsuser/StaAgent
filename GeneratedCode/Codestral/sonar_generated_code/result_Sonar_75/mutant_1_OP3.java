class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        if(isUnreachableCondition()) { // Unreachable if statement mutant
            throw new IllegalStateException("This condition is unreachable.");
        }
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    private boolean isUnreachableCondition() {
        return false; // The condition is always false, making the if branch unreachable
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}