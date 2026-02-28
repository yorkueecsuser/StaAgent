class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        if (getCondition()) {
            // Unreachable if statement
            System.out.println("This statement is unreachable");
        }
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    private boolean getCondition() {
        // A method that always returns false
        return false;
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}