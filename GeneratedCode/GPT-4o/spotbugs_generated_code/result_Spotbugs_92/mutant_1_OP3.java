class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            return 1;
        } else {
            return 0;
        }

        // Unreachable if statement mutation
        boolean isUnreachable = getCondition(); // dynamically determined condition
        if (isUnreachable) {
            System.out.println("This will never be printed.");
        }
    }

    // Method to simulate dynamic condition evaluation, always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}