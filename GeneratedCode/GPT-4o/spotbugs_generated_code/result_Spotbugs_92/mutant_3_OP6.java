class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // Unreachable loop
            }
            return 1;
        } else {
            return 0;
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}