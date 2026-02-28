class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // Unreachable if statement mutant
        if (x < 0) {
            System.out.println("This code will never be executed.");
        }

        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int result = x & x;
        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}