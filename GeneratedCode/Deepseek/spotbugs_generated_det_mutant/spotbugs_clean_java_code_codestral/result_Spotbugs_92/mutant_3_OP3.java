class SelfComparisonBug {
    public boolean showBug(int value) {
        // Original bug: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        boolean shouldRun = getCondition();
        if (!shouldRun) {  // Unreachable if statement
            System.out.println("Unreachable code");
        }
        return value == value; // Self comparison of value with itself
    }

    private boolean getCondition() {
        return false;
    }
}