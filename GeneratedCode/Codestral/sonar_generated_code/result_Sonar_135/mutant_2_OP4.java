class FinalizerBug {
    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            java.lang.Runtime.getRuntime().runFinalization();
        } else {
            // Alternative code path (which is the original code)
            java.lang.Runtime.getRuntime().runFinalization();
        }
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