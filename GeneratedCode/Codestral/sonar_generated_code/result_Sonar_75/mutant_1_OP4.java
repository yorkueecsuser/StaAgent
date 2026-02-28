class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        boolean unreachableCondition = isUnreachable();

        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed");
        } else {
            return numerator / denominator; // Noncompliant, possible division by zero
        }
    }

    private boolean isUnreachable() {
        return false; // Making the condition always false
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}