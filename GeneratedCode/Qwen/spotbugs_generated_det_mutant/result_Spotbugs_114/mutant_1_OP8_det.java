class NaNBugExample {

    public boolean showBug(double x) {
        return x == Double.NaN; // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)  
    }

    public static void main(String[] args) {
        NaNBugExample example = new NaNBugExample();
        double szyapres = Double.NaN;
        double qbyjmtjp = 0.0;

        System.out.println("Checking NaN value: " + example.showBug(szyapres)); // Expected: false
        System.out.println("Checking normal value: " + example.showBug(qbyjmtjp)); // Expected: false
    }
}