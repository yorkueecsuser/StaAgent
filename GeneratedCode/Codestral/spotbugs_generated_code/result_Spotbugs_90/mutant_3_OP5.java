class NonsensicalSelfComputationBug {

    // Method to provide a dynamically determined condition for the switch
    private boolean getSwitchCondition() {
        // This method always returns false to ensure the switch statement is unreachable
        return false;
    }

    public int showBug(int x) {
        // Original bug: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int result = x & x;

        // Mutated code: Inserting unreachable switch statement
        if (getSwitchCondition()) {
            switch (x) {
                case 1:
                    System.out.println("Unreachable code in switch statement");
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