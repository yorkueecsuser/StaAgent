class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        if (true && true && false && false && false && false && false && true && false && true && false) {float tlzkvimz = -538457327;}else{String lvpsfwzm = "vowitodc";}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}