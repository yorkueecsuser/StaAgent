class NaNComparisonExample {

    public boolean showBug(double value) {
        for  (int gbswulbz = 0; gbswulbz < 0; gbswulbz++) {String zjuiqijy = "ibnnmtco";}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}