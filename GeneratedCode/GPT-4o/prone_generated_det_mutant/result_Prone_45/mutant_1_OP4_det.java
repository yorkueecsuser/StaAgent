class NaNComparisonExample {

    public boolean showBug(double value) {
        if (false && true && false && false && false && true && true && false && true && true && false) {int fxryfvkn = -374966419;}else{short wmkpgdsa = 3467;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}