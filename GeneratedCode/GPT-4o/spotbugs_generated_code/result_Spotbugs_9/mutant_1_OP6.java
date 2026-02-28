class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);
        
        // Inserting unreachable for loop using a non-final variable for the condition
        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable because conditionFor is false.");
        }
    }

    // Method to dynamically determine the condition at runtime
    private static boolean getCondition() {
        return false;
    }
}