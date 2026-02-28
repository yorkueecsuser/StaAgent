class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        int deadStore1 = 0; // Mutation: Dead Store
        return numerator / denominator;  // This line throws ArithmeticException
    }

}