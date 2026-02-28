class SelfComputationExample {

    public int showBug(int x) {
        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)

        // Mutation: Inserting unreachable while loop
        boolean conditionWhile = getCondition(); // Ensures the condition is dynamically determined
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }

        return result;
    }

    public int showBug2(int x) {
        // This line performs a nonsensical computation by subtracting a variable from itself
        int result = x - x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)

        // Mutation: Inserting unreachable while loop
        boolean conditionWhile = getCondition(); // Ensures the condition is dynamically determined
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }

        return result;
    }

    // Helper method to ensure dynamic determination of the loop condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + example.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + example.showBug2(5));
    }
}