class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();

        // Added unique mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Do nothing
        }
    }

    // Helper function to get a dynamic condition
    private static boolean getCondition() {
        return false;
    }
}