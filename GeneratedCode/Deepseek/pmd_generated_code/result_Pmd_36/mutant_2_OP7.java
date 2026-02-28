class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();

        // Mutated unreachable while loop
        boolean condition = getCondition();
        while (condition) {
            /* code */
        }
    }

    // Added getCondition method
    private static boolean getCondition() {
        return false;
    }
}