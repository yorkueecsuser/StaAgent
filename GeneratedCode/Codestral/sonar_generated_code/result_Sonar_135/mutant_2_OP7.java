class FinalizerBug {
    public void showBug() {
        // BUG: "runFinalizersOnExit" should not be called
        java.lang.Runtime.getRuntime().runFinalization();

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable loop.");
        }
    }

    protected void finalize(){
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }

    private boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        FinalizerBug bug = new FinalizerBug();
        bug.showBug();
    }
}