class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        if (false) { // unreachable mutation
            System.out.println("Unreachable code");
        }
        return numerator / denominator;  // This line throws ArithmeticException
    }

}