class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        if (true && true && true && true && true && true && true && false && true && true && false) {char qsshceje = 'o';}else{int cqkqlwxu = -750803648;}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}