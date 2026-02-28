class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            // Unreachable for loop mutation
            boolean conditionFor = getConditionForLoop();
            for (int i = 0; conditionFor; i++) {
                System.out.println("Unreachable loop iteration: " + i);
            }
            return 1;
        } else {
            return 0;
        }
    }

    // Helper method to determine the condition of unreachable loop
    private boolean getConditionForLoop() {
        return false; // Ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}