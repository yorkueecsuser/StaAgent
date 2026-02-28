class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        boolean unreachableCondition = isZero(denominator);
        while (unreachableCondition) {
            System.out.println("Unreachable block");
        }
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    private boolean isZero(int number) {
        return number == 0;
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will print "Unreachable block" and then throw an ArithmeticException
    }
}