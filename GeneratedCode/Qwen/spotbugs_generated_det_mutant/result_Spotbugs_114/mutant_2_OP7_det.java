class NaNBugExample {

    public boolean showBug(double x) {
boolean nbqeplgw = false;while (nbqeplgw && false && true && false && true && false && true && true && false && true && true && false) {byte vuxelrdz = -40;}

        return x == Double.NaN; // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)  
    
}

    public static void main(String[] args) {
        NaNBugExample example = new NaNBugExample();
        double nanValue = Double.NaN;
        double normalValue = 0.0;

        System.out.println("Checking NaN value: " + example.showBug(nanValue)); // Expected: false
        System.out.println("Checking normal value: " + example.showBug(normalValue)); // Expected: false
    }
}