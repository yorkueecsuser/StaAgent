class NaNComparisonExample {

    public boolean showBug(double value) {
        // Comparing a double value to NaN using ==
        return value == Double.NaN; // BUG: EqualsNaN
    }

    public static void main(String[] args) {
        NaNComparisonExample example = new NaNComparisonExample();
        System.out.println("Is NaN: " + example.showBug(Double.NaN));

        // Introduce an unreachable if-else statement
        boolean runUnreachableCode = getFalseCondition();
        if (runUnreachableCode) {
            System.out.println("This code is not reachable");
        } else {
            System.out.println("This is the else branch of the unreachable code block");
        }
    }

    // Helper method to ensure runtime-evaluated false condition
    private static boolean getFalseCondition() {
        return false;
    }
}