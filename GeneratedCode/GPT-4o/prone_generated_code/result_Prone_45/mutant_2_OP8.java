class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public boolean showBugMutant(double a) {
        // Comparing a double value to NaN using ==
        return a == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
        System.out.println("Is NaN (Mutant): " + example.showBugMutant(Double.NaN));
    }
}