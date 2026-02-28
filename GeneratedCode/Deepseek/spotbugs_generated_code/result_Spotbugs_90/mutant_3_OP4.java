class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int result = x & x;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            // Mutated Code: Unreachable if-else statement
            if (getUnreachableCondition()) {
                System.out.println("This branch is unreachable due to the method call.");
            }
        }
        return result;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}