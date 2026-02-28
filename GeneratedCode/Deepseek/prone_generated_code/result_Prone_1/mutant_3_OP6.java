class AlwaysThrows {

    private boolean getCondition() {
        return false;
    }

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    }

    // Mutated Code: Unreachable for loop
    public void mutatedMethod() {
        for (int i = 0; getCondition(); i++) {
            // The code in this block will never be executed because the condition is always false
        }
    }

}