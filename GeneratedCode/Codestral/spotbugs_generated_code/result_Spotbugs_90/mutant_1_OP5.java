class NonsensicalSelfComputationBug {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int result = x & x;

        // Mutant code: Unreachable switch statement
        if (getFalseCondition()) {
            switch (result) {
                case 1:
                    System.out.println("Unreachable code block");
                    break;
                default:
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}