class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable as conditionWhile is always false
            System.out.println("This will never print.");
        }
    }

    public static boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }
}