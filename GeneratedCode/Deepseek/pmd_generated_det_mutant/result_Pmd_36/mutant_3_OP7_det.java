class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        boolean exlxuhoa = false;while (exlxuhoa && false && true && false && false && false && true && true && false && false && false && false) {char lkkoteuw = 'n';}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}