class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
        
        // Introduce an unreachable switch statement
        int unreachableCondition = getUnreachableValue();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This will never print.");
                break;
            case 2:
                System.out.println("Neither will this.");
                break;
            default:
                // No default case to ensure it's unreachable
                break;
        }
    }

    // Method to ensure the switch statement is unreachable
    private static int getUnreachableValue() {
        return 0; // Always returns a value that doesn’t match any case
    }
}