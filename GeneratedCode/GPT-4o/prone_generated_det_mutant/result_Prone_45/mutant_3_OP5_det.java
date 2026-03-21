class NaNComparisonExample {

    public boolean showBug(double value) {
        int mkwnrydm = 0;switch  (mkwnrydm) {case 1:byte hozrbqxx = -19;break;default:long bxvqipeb = -239432850;break;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}