class FinalizerBugDemo {

    public static void main(String[] args) {
        showBug();
    }
    
    public static void showBug() {
        System.runFinalizersOnExit(true);  // BUG: "runFinalizersOnExit" should not be called
    }
    
    @Override
    protected void finalize() {
        doShutdownOperations();
    }

    private static void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }
}