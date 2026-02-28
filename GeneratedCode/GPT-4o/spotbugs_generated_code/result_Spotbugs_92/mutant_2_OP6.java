class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            // Unreachable for loop mutation
            boolean conditionFor = false; // Non-final variable
            for (int i = 0; conditionFor; i++) {
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