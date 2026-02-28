class NonsensicalSelfComputationBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int x) {
        // Original Bug: SA: Nonsensical self computation involving a variable (e.g., x & x)
        int result = x & x;

        // Mutant: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This is an unreachable branch.");
        } else {
            int unusedVariable = 0;
            // This else branch is unreachable and introduces a new variable
        }

        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}