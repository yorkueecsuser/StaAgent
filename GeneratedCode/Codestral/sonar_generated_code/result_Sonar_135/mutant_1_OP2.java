class FinalizerBug {
    public void showBug() {
        java.lang.Runtime.getRuntime().runFinalization();
        System.out.println("Performing shutdown operations..."); // Duplicated statement
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