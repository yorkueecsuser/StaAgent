class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // Inserted mutant unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This loop is unreachable");
        }

        // BUG: Zero should not be a possible denominator
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}