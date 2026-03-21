class NaNComparisonExample {

    public boolean showBug(double value) {
        for  (int nsgidwxj = 0; nsgidwxj < 0; nsgidwxj++) {long zemzvyiw = -967421175;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}