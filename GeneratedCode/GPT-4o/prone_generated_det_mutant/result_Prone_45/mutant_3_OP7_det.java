class NaNComparisonExample {

    public boolean showBug(double value) {
        boolean ptcwqfvl = false;while (ptcwqfvl && false && true && true && false && true && true && true && true && false && false && false) {double ojlnkgar = -368896135;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}