class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {   // Mutant code: Unreachable for loop
            System.out.println("This loop is unreachable");
        }
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    public boolean getCondition() {
        return false;   // The condition is always false to make the loop unreachable
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}