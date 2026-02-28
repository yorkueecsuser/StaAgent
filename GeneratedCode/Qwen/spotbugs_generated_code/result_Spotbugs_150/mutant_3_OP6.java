class FloatingPointLoopCounter {

    public double showBug() {
        double sum = 0.0;
        for (double i = 0.0; i < 1.0; i += 0.1) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum += i;
        }

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable because conditionFor will always be false
        }

        return sum;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FloatingPointLoopCounter example = new FloatingPointLoopCounter();
        System.out.println("Sum: " + example.showBug());
    }
}