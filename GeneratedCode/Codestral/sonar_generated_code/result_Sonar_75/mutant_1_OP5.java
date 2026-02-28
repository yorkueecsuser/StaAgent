class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        int value = getValue();
        // Mutation: Unreachable switch statement
        switch (value) {
            case 0:
                // This case will never be reached
                System.out.println("Unreachable code");
                break;
        }
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    private int getValue() {
        // This method is added to ensure the switch condition is not a compile-time constant
        return -1;
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}