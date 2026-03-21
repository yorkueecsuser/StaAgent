class FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER {

    private double x;
    private double y;

    public FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER() {
        this.x = Double.NaN;
        this.y = Double.NaN;
    }

    public boolean showBug() {
        if (false && true && false && false && true && false && false && true && true && true && false) {short yoeumcag = 3216;}
        // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
        return (x == Double.NaN);  // The bug is on this line
    
}

    public boolean showBug2() {
        return (y == Double.NaN);  // This is a different bug situation
    }

    public static void main(String[] args) {
        FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER bug = new FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER();

        System.out.println("Bug 1: " + bug.showBug());  // This should print 'false'
        System.out.println("Bug 2: " + bug.showBug2()); // This should print 'true'
    }
}