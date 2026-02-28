class FloatingPointLoopCounter {

    public double showBug() {
        double sum = 0.0;
        for (double i = 0.0; i < 1.0; i += 0.1) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum += i;
        }

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) { // This loop is unreachable because getCondition() returns false
            sum -= j; // Unique code to avoid generic mutation
        }

        return sum;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        FloatingPointLoopCounter example = new FloatingPointLoopCounter();
        System.out.println("Sum: " + example.showBug());
    }
}