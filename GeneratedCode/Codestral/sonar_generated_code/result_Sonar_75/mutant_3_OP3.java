class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        boolean shouldRun = getCondition();  // This method returns a boolean value
        if (shouldRun) {
            // This block will never execute because'shouldRun' is always false
            int result = denominator - denominator;
            numerator = numerator / result;  // This will throw an ArithmeticException
        }

        // BUG: Zero should not be a possible denominator
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    public boolean getCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}