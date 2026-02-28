class SelfComparisonBug {
    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        if (1 == 0) {  // Unreachable if statement
            System.out.println("This statement should never execute");
        }
        return value == value;  // Self comparison of value with itself
    }
}