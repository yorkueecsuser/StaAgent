class AlwaysThrows {
    boolean conditionWhile = true;

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        while (conditionWhile == false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        return numerator / denominator;  // This line throws ArithmeticException
    }
}