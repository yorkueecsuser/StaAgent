class NaNComparisonExample {

    public boolean showBug(double value) {
        // Inserting an unreachable for loop with a dynamically determined condition
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable because conditionFor is always false
            System.out.println("This is an unreachable loop.");
        }
        
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));
    }

    // A method that returns a boolean condition used for the unreachable loop
    private boolean getCondition() {
        return false;
    }
}