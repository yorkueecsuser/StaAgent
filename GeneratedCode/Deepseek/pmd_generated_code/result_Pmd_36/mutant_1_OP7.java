class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        if (false) { // unreachable if statement
            System.exit(0); // never call this when running in an application server!
        }
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}