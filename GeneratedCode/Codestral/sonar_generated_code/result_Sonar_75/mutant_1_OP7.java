class ZeroDenominator {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        while (getFalseCondition()) {
            // Unreachable while loop
            System.out.println("This loop is unreachable.");
        }
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}