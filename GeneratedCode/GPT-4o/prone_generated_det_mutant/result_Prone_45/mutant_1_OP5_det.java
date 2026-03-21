class NaNComparisonExample {

    public boolean showBug(double value) {
        int gnxsoxbm = 0;switch  (gnxsoxbm) {case 1:short essslgux = 9769;break;default:byte ibjqyklk = -11;break;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}