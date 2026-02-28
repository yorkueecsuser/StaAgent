class FinalizerBug {
    public void showBug() {
        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }

        java.lang.Runtime.getRuntime().runFinalization();
    }

    protected void finalize(){
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FinalizerBug bug = new FinalizerBug();
        bug.showBug();
    }
}