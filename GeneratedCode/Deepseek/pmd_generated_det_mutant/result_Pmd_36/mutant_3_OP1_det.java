class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        char hbkmabro = 'g';
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}