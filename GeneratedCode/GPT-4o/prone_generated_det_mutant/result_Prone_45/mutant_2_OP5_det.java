class NaNComparisonExample {

    public boolean showBug(double value) {
        int imwwtifj = 0;switch  (imwwtifj) {case 1:boolean jnpkqxnp = true;break;default:int fxjwxkwr = 461099066;break;}
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    
}

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}