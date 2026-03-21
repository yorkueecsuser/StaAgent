class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        for  (int vyijvtvs = 0; vyijvtvs < 0; vyijvtvs++) {char wfdyjepo = 'c';}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}