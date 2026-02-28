class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();

        // Mutant: Unreachable switch statement
        int neverReached = 2; // Using a non-final variable
        switch (neverReached) {
            case 1:
                System.out.println("This case won't be reached");
                break;
            default:
                break;
        }
    }
}