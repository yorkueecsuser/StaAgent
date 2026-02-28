class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            return 1;
        } else {
            return 0;
        }
        
        // Unreachable if-else statement via mutation operator
        boolean condition = getFalseCondition();
        if (condition) {
            // This block is unreachable as condition is always false
            System.out.println("This is an unreachable block.");
        } else {
            System.out.println("This is the alternative unreachable block.");
        }
    }

    private boolean getFalseCondition() {
        // Create a condition that always returns false
        return false; 
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}