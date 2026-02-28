class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
        
        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                // Default case to prevent compilation error
                break;
        }
    }
    
    // Method to generate a value that makes the switch statement unreachable
    private static int getUnreachableValue() {
        return 0; // Always returns 0, making the case 1 unreachable
    }
}