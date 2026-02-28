class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        System.exit(0); // never call this when running in an application server!
    }

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();

        boolean condition = false; // added unreachable if-else statement
        if (condition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}