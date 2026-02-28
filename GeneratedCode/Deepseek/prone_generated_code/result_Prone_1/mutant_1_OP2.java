class AlwaysThrows {

    public int showBug() {
        int numerator = 10;
        int denominator = 0;

        // Mutant: duplicated the "denominator=0" assignment statement
        int denominator_mutant = 0;

        return numerator / denominator;  // This line throws ArithmeticException
    }

}