class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        boolean condition = true; // Added a condition variable
        for (int i = 0;!condition; i++) {
            // Add code here if needed
        }
        return numerator / denominator;  // This line throws ArithmeticException
    }

}