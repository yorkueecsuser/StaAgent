class NaNComparisonBug {
    private boolean shouldRun = true; // Added mutated code

    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        if (this.shouldRun) {
            return (someDouble == Double.NaN);
        } 
        
        // Mutant code being added here
        if (someDouble == Double.NaN) {
            System.out.println("This will be unreachable!");
        }
        
        return false;
    }
}