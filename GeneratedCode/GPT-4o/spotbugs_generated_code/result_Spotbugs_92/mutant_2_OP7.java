class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            
            // Inserting an unreachable while loop
            boolean conditionWhile = getCondition(); // using a method to ensure the condition is determined at runtime
            while (conditionWhile) {
                // unreachable code
                System.out.println("This will never be printed.");
            }

            return 1;
        } else {
            return 0;
        }
    }

    // Helper method to ensure the condition is determined at runtime
    private boolean getCondition() {
        return false; // condition is false, making the while loop unreachable
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}