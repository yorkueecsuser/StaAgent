class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        boolean neverReached = false;
        if (neverReached) {
            System.out.println("This code is never reached.");
        } else {
            return (someDouble == Double.NaN);
        }
        return false; // This line is unreachable, but a non-void method must return a value.
    }
}