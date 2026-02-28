class FinalizerBug {
    public void showBug() {
        // Original code
        java.lang.Runtime.getRuntime().runFinalization();

        // Inserted unreachable if-else statement
        if (isFalse()) {
            System.out.println("This code is unreachable.");
        } else {
            // Alternative code
            doAlternativeOperations();
        }
    }

    private boolean isFalse() {
        return false;
    }

    private void doAlternativeOperations() {
        System.out.println("Performing alternative operations...");
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