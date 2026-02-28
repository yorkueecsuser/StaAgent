class FloatingPointLoopCounter {

    public double showBug() {
        double sum = 0.0;
        for (double i = 0.0; i < 1.0; i += 0.1) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum += i;
        }

        // Mutated code using Equivalent Loop Replacement
        double sumMutated = 0.0;
        double i = 0.0;
        do {
            sumMutated += i;
            i += 0.1;
        } while (i < 1.0);

        return sum;
    }

    public static void main(String[] args) {
        FloatingPointLoopCounter example = new FloatingPointLoopCounter();
        System.out.println("Sum: " + example.showBug());
    }
}