class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        boolean condition = getCondition(); // Use a non-final variable to control reachability

        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            return 1;
        } else {
            return 0;
        }

        if (condition) { // Unreachable if-else statement mutation
            System.out.println("This is unreachable code block 1.");
        } else {
            System.out.println("This is unreachable code block 2.");
        }
    }

    private boolean getCondition() {
        return false; // Method returning false to simulate an unreachable branch
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}