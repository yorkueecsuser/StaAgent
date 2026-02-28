class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
        
        // Added unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition(); // This method will always return false
        if (unreachableCondition) {
            System.out.println("This will never execute.");
        } else {
            System.out.println("Unreachable condition is false.");
        }
    }
    
    // Helper method to provide a non-final condition for the if statement
    public static boolean getUnreachableCondition() {
        return false; // This is a dynamic condition that ensures the branch is unreachable
    }
}