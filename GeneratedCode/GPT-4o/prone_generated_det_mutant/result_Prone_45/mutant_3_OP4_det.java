class NaNComparisonExample {

    public boolean showBug(double value) {
        if (true && false && true && true && false && true && false && false && true && false && false) {int rywahlay = 697505137;}else{long vgiqzxmf = 780468353;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}