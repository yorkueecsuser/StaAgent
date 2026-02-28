class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        denominator = 0;  // duplicated assignment statement
        return numerator / denominator;  // This line throws ArithmeticException
    }

}