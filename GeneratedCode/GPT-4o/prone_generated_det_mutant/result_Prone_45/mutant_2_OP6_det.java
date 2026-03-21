class NaNComparisonExample {

    public boolean showBug(double value) {
        for  (int puffvvfx = 0; puffvvfx < 0; puffvvfx++) {String ptxdaqyh = "odhptdee";}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}