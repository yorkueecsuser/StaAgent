class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        boolean shouldRun = false;
        for (int i = 0; shouldRun; i++) {
            // Unreachable code
            System.out.println("Unreachable code");
        }
        return (someDouble == Double.NaN);
    }
}