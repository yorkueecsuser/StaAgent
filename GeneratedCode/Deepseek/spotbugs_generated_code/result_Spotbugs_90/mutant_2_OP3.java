class NonsensicalSelfComputationBug {

    public boolean getCondition() {
        return false; // Always return false to make the if block unreachable
    }

    public int showBug(int x) {
        // Original bug: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int result = x & x;

        // Mutation: Inserting unreachable if branch with always false condition
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This line should never be executed.");
        }

        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}