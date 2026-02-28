class NaNBugExample {

    public boolean showBug(double x) {
        // Introduced unreachable for loop according to the mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
        }

        return x == Double.NaN; // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
    }

    private boolean getCondition() {
        // This method ensures the condition is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        NaNBugExample example = new NaNBugExample();
        double nanValue = Double.NaN;
        double normalValue = 0.0;

        System.out.println("Checking NaN value: " + example.showBug(nanValue)); // Expected: false
        System.out.println("Checking normal value: " + example.showBug(normalValue)); // Expected: false
    }
}