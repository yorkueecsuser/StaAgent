class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)

        // Introduced unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            result = result + 1; // This branch is unreachable because getCondition() always returns false
        } else {
            result = result - 1; // This branch is also unreachable because getCondition() always returns false
        }

        return result;
    }

    // Method to provide a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}