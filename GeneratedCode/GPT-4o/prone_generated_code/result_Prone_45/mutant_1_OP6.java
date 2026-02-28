class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));

        // Inserted an unreachable for loop using a dynamically determined condition
        boolean conditionFor = getCondition(); // method to determine the loop condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
    }

    // Method used to get a runtime condition for the unreachable loop
    public static boolean getCondition() {
        return false; // Ensuring the loop is unreachable
    }
}