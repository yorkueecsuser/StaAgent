class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));

        // Duplication mutation: Duplicate the assignment statement
        boolean isNaN = example.showBug(Double.NaN);
        boolean isNaNDuplicate = example.showBug(Double.NaN); // Duplicated assignment
        System.out.println("Duplicate check - Is NaN: " + isNaNDuplicate);
    }
}