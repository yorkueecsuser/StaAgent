class SelfComparisonBug {

    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;

        // Mutated code with an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable because shouldRun is always false
            value += 10;
        } else {
            // This block is also unreachable because shouldRun is always false
            value -= 10;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}