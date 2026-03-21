class SelfComparisonBug {
    public boolean showBug(int value) {
        // Original bug: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This line should not execute");
        }
        return value == value; // Self comparison of value with itself
    }
}