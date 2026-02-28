class FinalizerBug {
    public void showBug() {
        java.lang.Runtime r = java.lang.Runtime.getRuntime();
        r.runFinalization();
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