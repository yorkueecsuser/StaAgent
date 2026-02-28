class FinalizerBug {
    public void showBug() {
        // Original code
        java.lang.Runtime.getRuntime().runFinalization();

        // Mutant code - Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This code should never be executed.");
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if statement unreachable
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