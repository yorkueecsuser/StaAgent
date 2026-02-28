class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            // Unreachable if-else statement mutation
            boolean condition = getCondition(); // Use a non-final variable
            if (condition) {
                System.out.println("This code is unreachable due to a false condition.");
            } else {
                System.out.println("This code will always execute because the condition is false.");
            }
            return 1;
        } else {
            return 0;
        }
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // This is a runtime-determined condition
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}