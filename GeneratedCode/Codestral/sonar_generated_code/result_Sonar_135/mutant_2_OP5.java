class FinalizerBug {
    public void showBug() {
        // Original code
        java.lang.Runtime.getRuntime().runFinalization();

        // Mutant code: Unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This is an unreachable case");
                break;
            // Add more cases as needed
        }
    }

    private int getUnreachableValue() {
        // This method always returns a value that makes the switch unreachable
        return -1;
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