class NaNComparisonExample {

    public boolean showBug(double value) {
        if (false && true && false && false && true && false && true && true && false && false && false) {int hplhuadu = 664517072;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}