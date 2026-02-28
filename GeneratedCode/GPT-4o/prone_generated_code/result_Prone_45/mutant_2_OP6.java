class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));

        // Unreachable for loop inserted
        boolean unreachableCondition = getCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This code is unreachable");
        }
    }

    // Method to simulate a condition that will always be false at runtime
    private static boolean getCondition() {
        return false;
    }
}