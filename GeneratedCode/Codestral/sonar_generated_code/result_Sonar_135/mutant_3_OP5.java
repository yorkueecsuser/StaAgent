class FinalizerBug {
    public void showBug() {
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                // Unreachable code
                System.out.println("This should never be printed.");
                break;
        }
        java.lang.Runtime.getRuntime().runFinalization();
    }

    private int getUnreachableValue() {
        return 0;
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