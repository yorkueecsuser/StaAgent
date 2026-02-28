class SelfComparisonBug {
    public boolean showBug(int value) {
        // Original bug: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable while loop
            System.out.println("This is an unreachable statement");
        }
        return value == value; // Self comparison of value with itself
    }
}