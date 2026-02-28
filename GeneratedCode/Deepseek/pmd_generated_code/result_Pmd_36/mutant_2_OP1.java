class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }
    
    public void unusedVariable() {
        String unusedVariable1234 = ""; // This is a dead store, never used
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
        d.unusedVariable();
    }
}