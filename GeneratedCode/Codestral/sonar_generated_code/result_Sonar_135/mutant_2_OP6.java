class FinalizerBug {
    public void showBug() {
        // Inserted unreachable for loop
        for(int i = 0; getCondition(); i++) {
            // This code will never be executed
        }
        java.lang.Runtime.getRuntime().runFinalization();
    }

    private boolean getCondition() {
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