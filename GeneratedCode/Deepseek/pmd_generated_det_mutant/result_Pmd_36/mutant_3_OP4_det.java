class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        if (false && false && false && false && false && false && false && false && false && true && false) {boolean cjxlsylo = true;}else{char uswxusyz = 'j';}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}