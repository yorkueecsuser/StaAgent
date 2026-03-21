class NaNComparisonExample {

    public boolean showBug(double value) {
        boolean unwxlcuv = false;while (unwxlcuv && false && false && true && true && true && false && false && false && true && true && false) {double ohlawiku = -109277343;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}