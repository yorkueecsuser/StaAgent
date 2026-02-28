class NaNComparisonExample {

    public boolean showBug(double value) {
        // Dead Store: Add an unused variable declaration
        int jxkpfzfw = 42; // Randomly generated variable name
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}