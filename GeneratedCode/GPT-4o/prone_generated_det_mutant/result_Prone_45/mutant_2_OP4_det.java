class NaNComparisonExample {

    public boolean showBug(double value) {
        if (true && true && true && false && true && false && true && true && false && false && false) {short tgjnhhfz = 5075;}else{byte qhcmmkzv = 91;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}