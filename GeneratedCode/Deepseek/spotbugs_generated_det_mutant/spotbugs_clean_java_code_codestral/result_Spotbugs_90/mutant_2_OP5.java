class NonsensicalSelfComputationBug {

    // Method to simulate a condition that always evaluates to false at runtime
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int x) {
        // Original Bug: SA: Nonsensical self computation involving a variable (x & x)
        int result = x & x;

        // Mutant Code: Unreachable switch statement
        int value = getValue();
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
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

    // Method to simulate a value for the switch statement
    private int getValue() {
        return 1;
    }
}