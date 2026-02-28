class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This is an unreachable loop");
        }
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    private boolean getCondition() {
        return false; // Always returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}