class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));

        // Unreachable if-else statement added
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block is unreachable and should never run.");
        } else {
            // This block will always execute
            System.out.println("This block will always run.");
        }
    }

    public static boolean getUnreachableCondition() {
        // This method always returns false
        return false;
    }
}