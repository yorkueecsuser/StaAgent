class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        if (true && true && true && false && true && false && false && false && false && true && false) {String astjgegn = "vqaqgzjj";}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}