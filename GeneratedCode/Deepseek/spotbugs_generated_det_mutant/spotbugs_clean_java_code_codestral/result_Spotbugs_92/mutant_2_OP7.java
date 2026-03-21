class SelfComparisonBug {
    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        }
        return value == value; // Self comparison of value with itself
    }
}