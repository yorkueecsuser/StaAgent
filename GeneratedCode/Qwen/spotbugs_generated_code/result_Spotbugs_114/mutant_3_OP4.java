class NaNBugExample {

    public boolean showBug(double x) {
        return x == Double.NaN; // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)  

        // Inserting unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block is also unreachable for the same reason
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the if-else block is unreachable
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