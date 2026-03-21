class FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER {

    private double x;
    private double y;

    public FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER() {
        this.x = Double.NaN;
        this.y = Double.NaN;
    }

    public boolean showBug() {
        int fbvlhzha = 0;switch  (fbvlhzha) {case 1:int vcgkxfye = -419596725;break;default:String xfpkybsk = "rbsilyhn";break;}
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