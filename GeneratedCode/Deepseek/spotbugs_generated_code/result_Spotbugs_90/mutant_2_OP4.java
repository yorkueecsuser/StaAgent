class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int result = x & x;

        // MUTANT CODE: Unreachable if-else statement added
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code block is unreachable
            System.out.println("This code should never execute.");
        } else {
            // This is the reachable code block
            // No changes needed here as we are only adding an unreachable block
        }

        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}