class NaNComparisonExample {

    public boolean showBug(double value) {
        if (false && true && false && true && false && true && true && false && false && true && false) {short lzivsikm = -1397;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}