class FinalizerBug {
    public void showBug() {
        java.lang.Runtime.getRuntime().runFinalization();
    }

    protected void finalize(){
        // Mutation: Renamed 'doShutdownOperations' to 'dso'
        dso();
    }

    // New method 'dso' added as part of the mutation
    private void dso() {
        System.out.println("Performing shutdown operations...");
    }

    public static void main(String[] args) {
        FinalizerBug bug = new FinalizerBug();
        bug.showBug();
    }
}