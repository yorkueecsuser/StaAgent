class FloatingPointLoopCounter {

    public double showBug() {
        double sum = 0.0;
        for (double i = 0.0; i < 1.0; i += 0.1) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum += i;
            // Mutant: Inserting an unreachable if statement
            boolean condition = getCondition();
            if (condition) {
                sum -= i; // This line is unreachable because getCondition() always returns false
            }
        }
        return sum;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        FloatingPointLoopCounter example = new FloatingPointLoopCounter();
        System.out.println("Sum: " + example.showBug());
    }
}