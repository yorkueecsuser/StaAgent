class FinalizerBug {
    public void showBug() {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable while loop
        }
        java.lang.Runtime.getRuntime().runFinalization();
    }

    private boolean getCondition() {
        // This method always returns false to make the while loop unreachable.
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