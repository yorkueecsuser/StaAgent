class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)

        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable only if getCondition() returns true
            result = result + 1;
        } else {
            // This block is unreachable because getCondition() always returns false
            result = result - 1;
        }

        return result;
    }

    // Method to provide a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}