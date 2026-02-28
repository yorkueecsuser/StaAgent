class FinalizerBug {
    public void showBug() {
        java.lang.Runtime.getRuntime().runFinalization();
    }

    protected void finalize(){
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }

    public static void main(String[] args) {
        FinalizerBug b = new FinalizerBug();  // variable "bug" renamed to "b"
        b.showBug();
    }
}