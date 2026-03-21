class NonsensicalSelfComputationBug {

    public boolean getFalseCondition() {
        return false;
    }

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int result = x & x;

        // Mutant: Unreachable while loop
        while (getFalseCondition()) {
            int y = x + x; // This line will never be executed
        }

        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}