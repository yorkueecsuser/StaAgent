class FinalizerBug {
    public void showBug() {
        java.lang.Runtime.getRuntime().runFinalization();

        // Mutated code: unreachable if statement
        if (isUnreachableConditionTrue()) {
            performUnreachableOperation();
        }
    }

    private boolean isUnreachableConditionTrue() {
        return false;
    }

    private void performUnreachableOperation() {
        System.out.println("This operation should be unreachable.");
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