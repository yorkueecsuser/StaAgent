class FinalizerBug {
    public void showBug() {
        // BUG: "runFinalizersOnExit" should not be called

        // Adding unreachable if branch
        boolean unreachableCondition = falseCondition();
        if (unreachableCondition) {
            java.lang.Runtime.getRuntime().runFinalization();
        } else {
            java.lang.Runtime.getRuntime().runFinalization();
        }
    }

    private boolean falseCondition() {
        return false;
    }

    protected void finalize(){
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }

    public static void main(String[] args) {
        FinalizerBug bug = new FinalizerBug();
        bug.showBug();
    }
}