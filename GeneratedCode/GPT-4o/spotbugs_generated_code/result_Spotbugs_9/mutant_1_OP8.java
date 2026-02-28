class RepeatedConditionalTestExample {

    public boolean showBug(int a, int b) { // Renamed variables x to a and y to b
        // This method demonstrates the repeated conditional test bug.
        return a == 0 || a == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);
    }
}