class NonsensicalSelfComputationBug {

    public boolean getCondition() {
        return false;
    }

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        while (getCondition()) {
            // Unreachable code
            int y = x & x;
        }
        int result = x & x;
        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}