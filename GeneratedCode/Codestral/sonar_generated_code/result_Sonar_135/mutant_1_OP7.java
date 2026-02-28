class FinalizerBug {
    public void showBug() {
        // BUG: "runFinalizersOnExit" should not be called
        java.lang.Runtime.getRuntime().runFinalization();

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop");
        }
    }

    protected void finalize(){
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FinalizerBug bug = new FinalizerBug();
        bug.showBug();
    }
}