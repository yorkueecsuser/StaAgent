class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            // Unreachable switch statement mutant inserted here
            int unreachableSwitchCondition = getUnreachableCondition();
            switch(unreachableSwitchCondition) {
                case 1:
                    System.out.println("This will never be printed.");
                    break;
                default:
                    break;
            }
            return 1;
        } else {
            return 0;
        }
    }

    // Method to simulate a runtime condition for the unreachable switch statement
    private int getUnreachableCondition() {
        return -1; // Always returns -1, which is not matched in the switch cases
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}