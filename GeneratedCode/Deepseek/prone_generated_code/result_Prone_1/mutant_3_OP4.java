class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        boolean condition = false; // The mutant: 'condition' is always false
        if (condition) {
            // This IF block is unreachable
            System.out.println("Unreachable block of code");
        }
        return numerator / denominator;  // This line throws ArithmeticException
    }

}