class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                result = x + x; // Some arbitrary operation
                break;
            case 1:
                // This case is always reached
                result = x & x; // Original buggy computation
                break;
        }

        return result;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This ensures the switch condition is always false, making the first case unreachable
    }

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}