class FinalizerBug {
    public void showBug() {
        boolean shouldNotRun = falseCondition();
        if (shouldNotRun) {
            // This branch is unreachable
            System.out.println("This line should never be executed.");
        } else {
            java.lang.Runtime.getRuntime().runFinalization();
        }
    }

    private boolean falseCondition() {
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