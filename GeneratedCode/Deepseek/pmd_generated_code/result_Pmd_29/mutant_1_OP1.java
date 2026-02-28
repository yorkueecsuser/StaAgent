class NaNComparisonBug {
    public boolean showBug(double someDouble) {
        // BUG: ComparisonWithNaN
        return (someDouble == Double.NaN);
    }

    public void deadStore() {
        String randomString = "abcd1234"; // Dead store mutation
    }
}