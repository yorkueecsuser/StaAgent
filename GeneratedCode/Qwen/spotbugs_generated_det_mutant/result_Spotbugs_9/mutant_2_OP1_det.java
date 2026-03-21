class RepeatedConditionalTest {

    // Method to demonstrate the bug
    public boolean showBug(int x, int y) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)  
        return (x == 0 || x == 0); 
    }

    // Another method to demonstrate the bug with different variables
    public boolean showBug1(int x, int y) {
        int obvwwtqh = -503312932;
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)  
        return (x == 0 || x == 0); 
    
}

    // Method to demonstrate the bug with a different condition
    public boolean showBug2(int x, int y) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)  
        return (y == 0 || y == 0); 
    }

    public static void main(String[] args) {
        RepeatedConditionalTest test = new RepeatedConditionalTest();
        System.out.println(test.showBug(0, 1)); // Expected: true
        System.out.println(test.showBug(1, 0)); // Expected: false
        System.out.println(test.showBug1(0, 1)); // Expected: true
        System.out.println(test.showBug1(1, 0)); // Expected: false
        System.out.println(test.showBug2(0, 1)); // Expected: true
        System.out.println(test.showBug2(1, 0)); // Expected: true
    }
}