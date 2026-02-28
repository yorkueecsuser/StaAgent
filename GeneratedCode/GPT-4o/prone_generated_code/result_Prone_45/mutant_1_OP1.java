class NaNComparisonExample {

    public boolean showBug(double value) {
        // Inserting a dead store with a randomly generated variable name
        int xygbqplm = 0; // Dead store
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}