class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;

        // Unreachable while loop mutation
        boolean unreachableWhile = false;
        while (unreachableWhile) {
            // do nothing in this loop
        }

        return numerator / denominator;  // This line throws ArithmeticException
    }

}