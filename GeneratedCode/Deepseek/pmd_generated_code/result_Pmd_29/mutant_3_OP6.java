class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        boolean unreachable = false; // This variable make the unreachable for loop reachable
        for(; unreachable == false; ) {
            // Unreachable code
            System.out.println("This code will never be executed");
        }
        return (someDouble == Double.NaN);
    }
}