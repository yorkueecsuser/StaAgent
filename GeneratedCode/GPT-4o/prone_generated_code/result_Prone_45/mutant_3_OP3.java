class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
        
        // Unreachable if statement mutation
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
    }
    
    // A method to simulate a condition that will always return false
    public static boolean getUnreachableCondition() {
        return false && Math.random() < 0;  // A dynamic condition that always evaluates to false
    }
}