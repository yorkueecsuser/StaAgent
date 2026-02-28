class AlwaysThrows {

    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        int unusedVar = 3; // This is the added line to avoid a Dead Store mutation
        return numerator / denominator;  // This line throws ArithmeticException
    }

}