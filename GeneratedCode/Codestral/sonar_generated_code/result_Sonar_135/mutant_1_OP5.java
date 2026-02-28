class FinalizerBug {
    public void showBug() {
        // BUG: "runFinalizersOnExit" should not be called
        java.lang.Runtime.getRuntime().runFinalization();

        // MUTATED CODE: Added unreachable switch statement
        boolean condition = false;
        switch (condition? 1 : 0) {
            case 1:
                System.out.println("This line should never be executed.");
                break;
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