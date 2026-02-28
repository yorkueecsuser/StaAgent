class ZeroDenominator {
    public int showBug(int numerator, int denominator) {
        // BUG: Zero should not be a possible denominator
        int value = getUnreachableValue(); // Added this method to ensure unreachable switch statement
        switch (value) { // Unreachable switch statement
            case 1:
                System.out.println("This line should never execute");
                break;
        }
        return numerator / denominator; // Noncompliant, possible division by zero
    }

    private int getUnreachableValue() {
        return -1; // This value will never be equal to 1, making the switch statement unreachable
    }

    public static void main(String[] args) {
        ZeroDenominator demo = new ZeroDenominator();
        System.out.println(demo.showBug(1, 0)); // This will throw an ArithmeticException
    }
}