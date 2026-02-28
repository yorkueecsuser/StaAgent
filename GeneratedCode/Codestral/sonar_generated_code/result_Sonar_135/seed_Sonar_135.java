class FinalizerBug {
    public void showBug() {
        // BUG: "runFinalizersOnExit" should not be called
        java.lang.Runtime.getRuntime().runFinalization();
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