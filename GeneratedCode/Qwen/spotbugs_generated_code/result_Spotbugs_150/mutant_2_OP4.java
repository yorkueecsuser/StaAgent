class FloatingPointLoopCounter {

    public double showBug() {
        double sum = 0.0;
        for (double i = 0.0; i < 1.0; i += 0.1) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum += i;
            // Inserting unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                sum += 0.01; // This part of the code is logically unreachable due to getCondition() always returning false
            } else {
                sum -= 0.01; // This part of the code is also logically unreachable due to getCondition() always returning false
            }
        }
        return sum;
    }

    private boolean getCondition() {
        return false; // This method always returns false, ensuring the if-else branches are unreachable
    }

    public static void main(String[] args) {
        FloatingPointLoopCounter example = new FloatingPointLoopCounter();
        System.out.println("Sum: " + example.showBug());
    }
}