class NaNComparisonExample {

    public boolean showBug(double value) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This should never be printed.");
        }
        
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }
    
    private boolean getCondition() {
        return false; // This makes the while loop unreachable.
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }
}