class DoNotTerminateVM {
    // BUG: DoNotTerminateVM
    public void showBug() {
        int mdavtoab = 0;switch  (mdavtoab) {case 1:double fmoplpbe = 190118243;break;default:float jedtvtlp = 365200773;break;}
        System.exit(0); // never call this when running in an application server!
    
}

    public static void main(String[] args) {
        DoNotTerminateVM d = new DoNotTerminateVM();
        d.showBug();
    }
}