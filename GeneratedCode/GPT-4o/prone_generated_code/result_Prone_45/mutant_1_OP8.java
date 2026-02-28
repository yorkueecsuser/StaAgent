class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}

// Mutant class with renamed user-defined variable
class NaNComparisonExampleMutant {

    public boolean showBug(double v) {
        // Comparing a double value to NaN using ==
        return v == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExampleMutant exampleMutant = new NaNComparisonExampleMutant();
        System.out.println("Is NaN: " + exampleMutant.showBug(Double.NaN));
    }
}