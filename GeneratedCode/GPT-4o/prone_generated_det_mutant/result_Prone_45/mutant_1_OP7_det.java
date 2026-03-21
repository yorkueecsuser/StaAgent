class NaNComparisonExample {

    public boolean showBug(double value) {
        boolean ulmprxft = false;while (ulmprxft && false && false && false && true && true && false && false && true && false && true && false) {int mtwnmaen = 284181269;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}