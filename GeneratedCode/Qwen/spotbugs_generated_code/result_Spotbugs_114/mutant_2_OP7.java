class NaNBugExample {

    public boolean showBug(double x) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }

        return x == Double.NaN; // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        NaNBugExample example = new NaNBugExample();
        double nanValue = Double.NaN;
        double normalValue = 0.0;

        System.out.println("Checking NaN value: " + example.showBug(nanValue)); // Expected: false
        System.out.println("Checking normal value: " + example.showBug(normalValue)); // Expected: false
    }
}