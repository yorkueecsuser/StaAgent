class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            // Inserted unreachable while loop using a dynamically determined condition
            boolean conditionWhile = false; // non-final variable to avoid compile-time constant
            while (conditionWhile) {
                System.out.println("This is unreachable code.");
            }
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}