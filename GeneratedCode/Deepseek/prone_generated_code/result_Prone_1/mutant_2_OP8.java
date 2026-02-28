class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int b = 0; // Mutation: Renaming denominator to 'b'
        return numerator / b;  // This line throws ArithmeticException
    }

}