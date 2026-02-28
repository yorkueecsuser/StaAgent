class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION) 

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            result = result + 1; // Some arbitrary operation to avoid empty loop body
        }

        return result;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}