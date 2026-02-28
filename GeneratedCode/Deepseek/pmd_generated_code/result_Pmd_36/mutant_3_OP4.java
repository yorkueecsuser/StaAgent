class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();

        // Mutant code
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This code will never be executed");
        } else {
            System.out.println("This code will always be executed");
        }
    }
}