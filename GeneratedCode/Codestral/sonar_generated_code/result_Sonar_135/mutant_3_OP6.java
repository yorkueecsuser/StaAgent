class FinalizerBug {
    public void showBug() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable for loop mutant
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