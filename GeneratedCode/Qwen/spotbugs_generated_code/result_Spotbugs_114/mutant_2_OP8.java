class NaNBugExample {

    public boolean showBug(double x) {
        return x == Double.NaN; // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)  
    }

    public static void main(String[] args) {
        NaNBugExample example = new NaNBugExample();
        double nanValue = Double.NaN;
        double normalValue = 0.0;

        System.out.println("Checking NaN value: " + example.showBug(nanValue)); // Expected: false
        System.out.println("Checking normal value: " + example.showBug(normalValue)); // Expected: false

        // Mutated code with renaming
        NaNBugExample e = new NaNBugExample();
        double n = Double.NaN;
        double v = 0.0;

        System.out.println("Checking NaN value: " + e.showBug(n)); // Expected: false
        System.out.println("Checking normal value: " + e.showBug(v)); // Expected: false
    }
}