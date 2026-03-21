class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        if (false && true && false && true && false && true && false && true && false && false && false) {double viadusry = 272333411;}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}