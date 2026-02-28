class SelfComparisonBug {
    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This code will never execute");
        }
        return value == value; // Self comparison of value with itself
    }
}