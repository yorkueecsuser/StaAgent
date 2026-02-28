class FloatingPointLoopCounter {

    public double showBug() {
        double sum = 0.0;
        for (double i = 0.0; i < 1.0; i += 0.1) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum += i;

            // Mutant: Inserting an unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop is unreachable because getCondition() will never return true
                sum -= i; // Unique operation to avoid generic code
            }
        }
        return sum;
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        FloatingPointLoopCounter example = new FloatingPointLoopCounter();
        System.out.println("Sum: " + example.showBug());
    }
}